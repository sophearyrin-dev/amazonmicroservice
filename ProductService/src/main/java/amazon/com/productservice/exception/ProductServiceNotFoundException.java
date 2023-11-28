package amazon.com.productservice.exception;

import lombok.Data;
import org.springframework.http.HttpStatus;

import java.util.function.Supplier;

@Data
public class ProductServiceNotFoundException extends Exception {
    private HttpStatus statusCode;

    public ProductServiceNotFoundException(
            String message,HttpStatus statusCode){
        super(message);
        this.statusCode = statusCode;

    }

}
