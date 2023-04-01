package hackhaton.codenrock.server.controller;


import hackhaton.codenrock.server.dto.UserDto;
import hackhaton.codenrock.server.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping(value = "api/v2/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping
    public UserDto get(@RequestParam Long id) {
        return userService.getUserById(id);
    }
}