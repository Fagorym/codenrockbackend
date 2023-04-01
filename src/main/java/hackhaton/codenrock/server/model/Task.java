package hackhaton.codenrock.server.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private String name;
    private Integer taskType;
    @ManyToOne
    private TaskGroup group;
    @OneToMany(mappedBy = "id")
    private Set<Question> jobs;

}
