package hackhaton.codenrock.server.dto;

import lombok.Data;

@Data
public class TaskGroupDto {
    private Long id;
    private String name;
    private String description;
    private Long count;
    private Long actualCount;
    private String image;
    private Long knowledgeId;
}
