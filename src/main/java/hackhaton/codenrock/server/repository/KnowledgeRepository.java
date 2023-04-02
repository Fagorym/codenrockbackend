package hackhaton.codenrock.server.repository;

import hackhaton.codenrock.server.model.KnowledgeBase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KnowledgeRepository extends JpaRepository<KnowledgeBase, Long> {
}
