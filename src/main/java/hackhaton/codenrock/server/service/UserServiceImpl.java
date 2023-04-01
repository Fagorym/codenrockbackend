package hackhaton.codenrock.server.service;

import hackhaton.codenrock.server.dto.UserDto;
import hackhaton.codenrock.server.exception.UserNotFoundException;
import hackhaton.codenrock.server.model.User;
import hackhaton.codenrock.server.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

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
}
