package hackhaton.codenrock.server.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class TaskGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String image;
    private Integer taskCount;
    @OneToMany(mappedBy = "task_group")
    private Set<Task> tasks;
}
