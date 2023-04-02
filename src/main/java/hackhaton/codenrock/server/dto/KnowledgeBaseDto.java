package hackhaton.codenrock.server.dto;

import lombok.Data;

@Data
public class KnowledgeBaseDto {
    private Long id;
    private String content;
    private Boolean wasRead;
}
