package hackhaton.codenrock.server.controller;

import hackhaton.codenrock.server.dto.QuestionDto;
import hackhaton.codenrock.server.service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping(value = "api/v2/question")
@RestController
@RequiredArgsConstructor
public class QuestionController {
    private final QuestionService questionService;

    @GetMapping
    public List<QuestionDto> getByTask(@RequestParam Long taskId) {
        return questionService.getByTaskId(taskId);
    }
}
