package uz.test.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import uz.test.demo.entity.Product;
import uz.test.demo.repositry.ProductRepository;

import java.util.Objects;

@SpringBootTest
public class RepositoryTest {

    @Autowired
    ProductRepository productRepository;



    @Test
    public void createProduct(){
        Product  product =  Product.builder().price(1500D).name("asdsa").build();
        productRepository.save(product);
        Assertions.assertAll(Objects.nonNull(product.getProductId()));
    }


}
