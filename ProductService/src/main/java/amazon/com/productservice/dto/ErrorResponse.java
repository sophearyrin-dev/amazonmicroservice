package amazon.com.productservice.dto;

import org.springframework.http.HttpStatus;

public class ErrorResponse {
    private String errorMessage;
    private HttpStatus status;
}
