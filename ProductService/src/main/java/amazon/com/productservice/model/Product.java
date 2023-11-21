package amazon.com.productservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;

    private String description;

    @Column(nullable = false)
    @NotNull
    private double price;

    @Column(nullable = false)
    @NotNull
    private double stock;

    public Product(String description, double price, double stock) {
        this.description = description;
        this.price = price;
        this.stock = stock;
    }
}
