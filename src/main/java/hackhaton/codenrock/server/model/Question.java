package hackhaton.codenrock.server.model;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;


@Data
@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String text;
    @ManyToOne
    private Task task;
    @OneToMany(mappedBy = "question", fetch = FetchType.EAGER)
    private List<Answer> answers;

}
