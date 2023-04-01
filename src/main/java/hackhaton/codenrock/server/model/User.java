package hackhaton.codenrock.server.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer level;
    private Integer experience;
    private Integer dailyScore;
    private Integer currentScore;
    @ManyToMany
    @JoinTable(
            name = "completed_tasks",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "tasks_id"))

    private List<Task> completedTasks;
}
