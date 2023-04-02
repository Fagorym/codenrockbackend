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
    private Boolean isNecessary;
    @OneToMany(mappedBy = "group", fetch = FetchType.LAZY)
    private Set<Task> tasks;
    @OneToOne
    private KnowledgeBase knowledgeBase;
}
