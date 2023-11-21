package amazon.com.productservice.service;

import amazon.com.productservice.dto.ProductRequest;
import amazon.com.productservice.model.Product;
import amazon.com.productservice.repository.ProductRepository;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
public class ProductService {

    private ProductRepository productRepository;
    private ModelMapper modelMapper;

    public ProductService(ProductRepository productRepository,
                          ModelMapper modelMapper) {
        this.productRepository = productRepository;
        this.modelMapper = modelMapper;
    }

    public List<Product> findAllProduct(){
        return productRepository.findAll();
    }

    public Product addProduct(ProductRequest productRequest){

        // Map ProductRequest to Product using ModelMapper
        Product product = modelMapper.map(productRequest, Product.class);

        log.info("adding product");
        // Save the mapped Product using the repository
        return productRepository.save(product);
    }
}
