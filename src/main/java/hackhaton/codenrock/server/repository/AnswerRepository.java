package hackhaton.codenrock.server.repository;

import hackhaton.codenrock.server.model.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<Answer, Long> {
}
