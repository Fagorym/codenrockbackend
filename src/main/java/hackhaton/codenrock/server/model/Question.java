package hackhaton.codenrock.server.model;


import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String text;
    @ManyToOne
    private Task task;
    /*@OneToMany(mappedBy = "id")
    private Set<Answer> answers;

     */
    @OneToOne
    private Answer rightAnswer;

}
