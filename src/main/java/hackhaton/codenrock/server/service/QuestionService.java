package hackhaton.codenrock.server.service;

import hackhaton.codenrock.server.dto.QuestionDto;

import java.util.List;

public interface QuestionService {
    List<QuestionDto> getByTaskId(Long taskId);
}
