package hackhaton.codenrock.server.dto;

import lombok.Data;

@Data
public class TaskDto {
    private Long id;
    private Integer number;
    private String name;
    private Integer type;
}
