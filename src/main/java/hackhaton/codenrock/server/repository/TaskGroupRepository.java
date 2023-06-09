package hackhaton.codenrock.server.repository;

import hackhaton.codenrock.server.model.Task;
import hackhaton.codenrock.server.model.TaskGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskGroupRepository extends JpaRepository<TaskGroup, Long> {
}
