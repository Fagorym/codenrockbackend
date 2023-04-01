package hackhaton.codenrock.server.service;

import hackhaton.codenrock.server.dto.QuestionDto;
import hackhaton.codenrock.server.repository.QuestionRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class QuestionServiceImpl implements QuestionService {
    private final QuestionRepository questionRepository;
    private final ModelMapper modelMapper;

    public List<QuestionDto> getByTaskId(Long taskId) {
        return questionRepository.getQuestionsByTaskId(taskId)
                .stream()
                .map(x -> modelMapper.map(x, QuestionDto.class))
                .toList();

    }
}
