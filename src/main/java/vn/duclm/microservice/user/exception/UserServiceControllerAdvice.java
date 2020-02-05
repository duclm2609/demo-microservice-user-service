package vn.duclm.microservice.user.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import vn.duclm.microservice.user.dto.ErrorResponseDTO;
import vn.duclm.microservice.user.enumeration.UserServiceErrorCode;

import java.net.HttpURLConnection;

@RestControllerAdvice
public class UserServiceControllerAdvice {
    @ExceptionHandler(UserNotFoundException.class)
    public final ResponseEntity<ErrorResponseDTO> handleUserNotFoundException(UserNotFoundException e) {
        ErrorResponseDTO userNotFoundErrorResponse = new ErrorResponseDTO();
        userNotFoundErrorResponse.setStatus(HttpURLConnection.HTTP_NOT_FOUND);
        userNotFoundErrorResponse.setErrorCode(UserServiceErrorCode.ERR_USER_NOT_FOUND);
        userNotFoundErrorResponse.setErrorMessage("User is not found");
        userNotFoundErrorResponse.setTraceMessage(e.getMessage());
        return new ResponseEntity<>(userNotFoundErrorResponse, HttpStatus.NOT_FOUND);
    }
}
