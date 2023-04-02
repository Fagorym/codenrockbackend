package hackhaton.codenrock.server.service;

import hackhaton.codenrock.server.model.Achievement;
import hackhaton.codenrock.server.model.User;
import hackhaton.codenrock.server.repository.AchievementRepository;
import hackhaton.codenrock.server.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AchievementServiceImpl implements AchievementService {
    private final AchievementRepository achievementRepository;
    private final UserRepository userRepository;

    @Override
    public void checkNewAchievements(User user) {
        List<Achievement> achievementSet = achievementRepository.findAll();
        for (Achievement achievement : achievementSet) {
            if (user.getCompletedTasks().size() >= achievement.getMaxScore()) {
                user.getNewAchievements().add(achievement);
            }
        }
        userRepository.save(user);

    }


}
