package hackhaton.codenrock.server.dto;

import lombok.Data;

@Data
public class TaskGroupDto {
    private String name;
    private String description;
    private Integer count;
    private String image;
}
