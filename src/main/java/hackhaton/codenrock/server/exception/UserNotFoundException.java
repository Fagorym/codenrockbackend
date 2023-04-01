package hackhaton.codenrock.server.exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(Long id) {
        super("User with id " + id + " not found in our system.");
    }
}
