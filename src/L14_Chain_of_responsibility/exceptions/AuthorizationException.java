package L14_Chain_of_responsibility.exceptions;

public class AuthorizationException extends RuntimeException {

    public AuthorizationException(String message) {
        super("AuthorizationException: " + message);
    }
}
