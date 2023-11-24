package amazon.com.productservice.exception;

import lombok.Data;

@Data
public class ProductServiceNotFoundException extends Exception{
    private String statusCode;

    public ProductServiceNotFoundException(
            String message,String statusCode){
        super(message);
        this.statusCode = statusCode;

    }
}
