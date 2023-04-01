package hackhaton.codenrock.server.service;

import hackhaton.codenrock.server.dto.AnswerDto;
import hackhaton.codenrock.server.dto.QuestionDto;
import hackhaton.codenrock.server.repository.QuestionRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class QuestionServiceImpl implements QuestionService {
    private final QuestionRepository questionRepository;
    private final ModelMapper modelMapper;

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
}