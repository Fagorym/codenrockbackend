package hackhaton.codenrock.server.repository;

import hackhaton.codenrock.server.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
    @Query(nativeQuery = true,
            value = "select * from question where task_id = ?1")
    List<Question> getQuestionsByTaskId(long taskId);
}
