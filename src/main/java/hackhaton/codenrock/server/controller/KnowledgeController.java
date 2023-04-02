package hackhaton.codenrock.server.controller;

import hackhaton.codenrock.server.dto.KnowledgeBaseDto;
import hackhaton.codenrock.server.service.KnowledgeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/v2/knowledge")
@RequiredArgsConstructor
public class KnowledgeController {
    private final KnowledgeService knowledgeService;

    @GetMapping(value = "/all")
    public List<KnowledgeBaseDto> getAll() {
        return knowledgeService.getAllKnowledge();
    }

    @GetMapping
    public KnowledgeBaseDto getById(@RequestParam Long knowledgeId) {
        return knowledgeService.getKnowledgeById(knowledgeId);
    }
}
