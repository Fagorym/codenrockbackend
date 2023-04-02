package hackhaton.codenrock.server.dto;

import lombok.Data;

@Data
public class AchievementDto {
    private Long id;
    private String name;
    private String description;
    private Integer maxScore;
    private Integer userScore;
    private String image;
}
