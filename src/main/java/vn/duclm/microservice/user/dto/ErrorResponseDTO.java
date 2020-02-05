package vn.duclm.microservice.user.dto;

import lombok.Data;
import vn.duclm.microservice.user.enumeration.UserServiceErrorCode;

@Data
public class ErrorResponseDTO {
    // HTTP response code
    private int status;
    // Application error code
    private UserServiceErrorCode errorCode;
    // Error message for displaying to end-user
    private String errorMessage;
    // Trace error message for developer
    private String traceMessage;
}
