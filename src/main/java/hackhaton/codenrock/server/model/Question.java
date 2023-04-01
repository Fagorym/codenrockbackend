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
    @OneToMany(mappedBy = "id")
    private Set<Answer> answers;
    @OneToOne
    private Answer rightAnswer;

}
