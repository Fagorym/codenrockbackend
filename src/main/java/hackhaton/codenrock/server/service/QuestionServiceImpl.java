package hackhaton.codenrock.server.service;

import hackhaton.codenrock.server.dto.AnswerDto;
import hackhaton.codenrock.server.dto.QuestionAnswersDto;
import hackhaton.codenrock.server.dto.QuestionAnswersListDto;
import hackhaton.codenrock.server.dto.QuestionDto;
import hackhaton.codenrock.server.exception.UserNotFoundException;
import hackhaton.codenrock.server.model.Answer;
import hackhaton.codenrock.server.model.Task;
import hackhaton.codenrock.server.model.User;
import hackhaton.codenrock.server.repository.AnswerRepository;
import hackhaton.codenrock.server.repository.QuestionRepository;
import hackhaton.codenrock.server.repository.TasksRepository;
import hackhaton.codenrock.server.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class QuestionServiceImpl implements QuestionService {
    private final QuestionRepository questionRepository;

    private final AchievementService achievementService;

    private final AnswerRepository answerRepository;
    private final ModelMapper modelMapper;
    private final UserRepository userRepository;
    private final TasksRepository tasksRepository;

    public List<QuestionDto> getByTaskId(Long taskId) {
        return questionRepository.getQuestionsByTaskId(taskId)
                .stream()
                .map((x) -> {
                    QuestionDto questionDto = modelMapper.map(x, QuestionDto.class);
                    List<AnswerDto> answers = new ArrayList<>();
                    x.getAnswers().forEach(ans ->
                            answers.add(modelMapper.map(ans, AnswerDto.class)));
                    questionDto.setAnswers(answers);
                    return questionDto;
                })
                .toList();

    }

    @Override
    public boolean checkAnswers(QuestionAnswersListDto questionAnswers) {
        int rightCount = 0;
        for (QuestionAnswersDto dto : questionAnswers.getQuestionAnswersDtoList()) {
            Answer answer = answerRepository.findById(dto.getAnswerId())
                    .orElseThrow(IllegalArgumentException::new);
            if (answer.getIsRight()) {
                rightCount++;
            }
        }
        if (rightCount == questionAnswers.getQuestionAnswersDtoList().size()) {
            User user = userRepository.findById(0L).orElseThrow(
                    () -> new UserNotFoundException(0L)
            );
            Task completed = tasksRepository.findById(questionAnswers.getTaskId())
                    .orElseThrow(() -> new UserNotFoundException(0L));
            Integer newExperience = user.getExperience() + completed.getEarnedExperience();
            int level = user.getLevel();
            while (newExperience > user.getExperienceMax()) {
                newExperience %= user.getExperienceMax();
                level++;
                user.setExperienceMax(user.getExperienceMax() + 400);
            }
            user.setLevel(level);
            user.setExperience(newExperience);
            Set<Task> tasks = user.getCompletedTasks();
            tasks.add(completed);
            user.setCompletedTasks(tasks);
            userRepository.save(user);
            achievementService.checkNewAchievements(user);
            return true;
        } else {
            return false;
        }
    }
}
