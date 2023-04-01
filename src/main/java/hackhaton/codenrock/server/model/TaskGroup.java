package hackhaton.codenrock.server.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
public class TaskGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String image;
    private Integer count;
    @OneToMany(mappedBy = "task_group")
    private Set<Task> tasks;
}
