package hackhaton.codenrock.server.controller;


import hackhaton.codenrock.server.dto.AchievementDto;
import hackhaton.codenrock.server.dto.UserDto;
import hackhaton.codenrock.server.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RequestMapping(value = "api/v2/user")
@RequiredArgsConstructor
@RestController
public class UserController {

    private final UserService userService;

    @GetMapping
    public UserDto get(@RequestParam Long userId) {
        return userService.getUserById(userId);
    }

    @PutMapping
    public void changePlan(@RequestParam Long userId, @RequestParam int userPlan) {
        userService.changePlan(userId, userPlan);
    }

    @GetMapping(value = "/achievements")
    public Set<AchievementDto> getAchievements(@RequestParam Long userId) {
        return userService.getAchievementByUserId(userId);
    }
}
