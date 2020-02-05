package vn.duclm.microservice.user.exception;

/**
 * Base exception type for User service exception
 */
public class UserException extends RuntimeException {
    public UserException(String message) {
        super(message);
    }

    public UserException(Throwable cause) {
        super(cause);
    }

    public UserException(String message, Throwable cause) {
        super(message, cause);
    }
}
