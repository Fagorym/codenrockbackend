package hackhaton.codenrock.server.repository;

import hackhaton.codenrock.server.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TasksRepository extends JpaRepository<Task, Long> {
    @Query(value = "SELECT DISTINCT * from task where group_id = ?1",
            nativeQuery = true)
    List<Task> getTasks(Long groupId);
}
