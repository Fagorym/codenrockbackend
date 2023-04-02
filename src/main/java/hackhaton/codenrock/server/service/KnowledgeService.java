package hackhaton.codenrock.server.service;

import hackhaton.codenrock.server.dto.KnowledgeBaseDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface KnowledgeService {
    List<KnowledgeBaseDto> getAllKnowledge();

    KnowledgeBaseDto getKnowledgeById(Long knowledgeId);
}
