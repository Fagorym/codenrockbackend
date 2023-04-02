package hackhaton.codenrock.server.service;

import hackhaton.codenrock.server.dto.UserDto;

public interface UserService {
    UserDto getUserById(Long id);

    void changePlan(Long userId, int userPlan);
}
