package hackhaton.codenrock.server.service;

import hackhaton.codenrock.server.dto.KnowledgeBaseDto;
import hackhaton.codenrock.server.repository.KnowledgeRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class KnowledgeServiceImpl implements KnowledgeService {
    private final KnowledgeRepository knowledgeRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<KnowledgeBaseDto> getAllKnowledge() {
        return knowledgeRepository.findAll()
                .stream()
                .map((x) -> modelMapper.map(x, KnowledgeBaseDto.class))
                .toList();
    }

    @Override
    public KnowledgeBaseDto getKnowledgeById(Long knowledgeId) {
        return modelMapper.map(
                knowledgeRepository.findById(knowledgeId),
                KnowledgeBaseDto.class);
    }
}
