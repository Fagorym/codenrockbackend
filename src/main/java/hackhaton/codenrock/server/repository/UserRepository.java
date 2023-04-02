package hackhaton.codenrock.server.repository;

import hackhaton.codenrock.server.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Long> {
    @Query(nativeQuery = true,
            value = "select user_score from user_achievement where user_id = ?1 and achievement_id =?2")
    Integer getScoreByUserAndAchievement(Long userId, Long id);
}

