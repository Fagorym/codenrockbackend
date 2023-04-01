package hackhaton.codenrock.server.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private String name;
    private Integer type;
    private Integer number;
    private Integer earnedExperience;
    @ManyToOne(fetch = FetchType.LAZY)
    private TaskGroup group;

}
