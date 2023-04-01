package hackhaton.codenrock.server.repository;

import hackhaton.codenrock.server.model.TaskGroup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskGroupRepository extends JpaRepository<TaskGroup, Long> {
}
