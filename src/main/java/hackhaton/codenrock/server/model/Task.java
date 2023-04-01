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
    private Integer type;
    @ManyToOne(fetch = FetchType.LAZY)
    private TaskGroup group;
    @OneToMany(mappedBy = "task", fetch = FetchType.LAZY)
    private Set<Question> jobs;

}
