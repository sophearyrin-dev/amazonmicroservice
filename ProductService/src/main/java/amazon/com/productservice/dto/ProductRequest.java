package amazon.com.productservice.dto;

import jakarta.persistence.Column;
import lombok.Data;
import org.antlr.v4.runtime.misc.NotNull;

@Data
public class ProductRequest {
    private String description;

    @Column(nullable = false)
    @NotNull
    private double price;

    @Column(nullable = false)
    @NotNull
    private double stock;
}
