package amazon.com.productservice.controller;

import amazon.com.productservice.dto.ProductRequest;
import amazon.com.productservice.model.Product;
import amazon.com.productservice.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/amazon/api/v1/product/")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/list")
    public List<Product> findAllProduct(){
        return productService.findAllProduct();
    }

    @PostMapping("/new")
    public ResponseEntity<Product> addNew(@RequestBody ProductRequest productRequest){
        return new ResponseEntity<>(productService.addProduct(productRequest),
                HttpStatus.CREATED);
    }
}
