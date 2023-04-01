package hackhaton.codenrock.server.model;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;


@Data
@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String text;
    @ManyToOne
    private Task task;
    @OneToMany(mappedBy = "question")
    private Set<Answer> answers;

}
