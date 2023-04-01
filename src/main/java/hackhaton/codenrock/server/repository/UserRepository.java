package hackhaton.codenrock.server.repository;

import hackhaton.codenrock.server.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
