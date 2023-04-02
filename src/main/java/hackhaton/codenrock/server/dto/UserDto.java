package hackhaton.codenrock.server.dto;


import lombok.Data;

@Data
public class UserDto {
    private String name;
    private Integer dailyScore;
    private Integer daysInRow;
    private Integer currentScore;
    private Integer experience;
    private Integer experienceMax;
    private Integer level;
}
