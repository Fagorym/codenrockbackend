package hackhaton.codenrock.server.service;

import hackhaton.codenrock.server.dto.AchievementDto;
import hackhaton.codenrock.server.dto.UserDto;
import hackhaton.codenrock.server.exception.UserNotFoundException;
import hackhaton.codenrock.server.model.User;
import hackhaton.codenrock.server.repository.UserRepository;
import hackhaton.codenrock.server.utils.ImageWorker;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    @Override
    public UserDto getUserById(Long id) {
        User user = userRepository.findById(id).orElseThrow(
                () -> new UserNotFoundException(id)
        );

        return modelMapper.map(user, UserDto.class);
    }

    @Override
    public void changePlan(Long userId, int userPlan) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new UserNotFoundException(userId));

        if (userPlan > 0) {
            user.setDailyScore(userPlan);
            userRepository.save(user);
        }
    }

    @Override
    public Set<AchievementDto> getAchievementByUserId(Long userId) {
        ImageWorker imageWorker = new ImageWorker();
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new UserNotFoundException(userId));
        return user
                .getAchievements()
                .stream()
                .map(achievement -> {
                    AchievementDto dto = modelMapper.map(achievement, AchievementDto.class);
                    dto.setUserScore(user.getCompletedTasks().size());
                    dto.setImage(imageWorker.getImageFromResource(achievement.getImage()));
                    return dto;
                })
                .collect(Collectors.toSet());
    }

    public Set<AchievementDto> getNewAchievements(Long userId) {
        ImageWorker imager = new ImageWorker();
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new UserNotFoundException(userId));
        Set<AchievementDto> newAchievements = user
                .getNewAchievements()
                .stream()
                .map(achievement -> {
                    user.getAchievements().remove(achievement);
                    AchievementDto dto = modelMapper.map(achievement, AchievementDto.class);
                    dto.setUserScore(user.getCompletedTasks().size());
                    dto.setImage(imager.getImageFromResource(achievement.getImage()));
                    return dto;
                })
                .collect(Collectors.toSet());
        userRepository.save(user);
        return newAchievements;
    }

}
