package hackhaton.codenrock.server.service;

import hackhaton.codenrock.server.dto.AchievementDto;
import hackhaton.codenrock.server.dto.UserDto;

import java.util.Set;

public interface UserService {
    UserDto getUserById(Long id);

    void changePlan(Long userId, int userPlan);

    Set<AchievementDto> getAchievementByUserId(Long userId);

    Set<AchievementDto> getNewAchievements(Long userId);
}
