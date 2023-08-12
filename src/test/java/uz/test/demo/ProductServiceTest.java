package uz.test.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import uz.test.demo.dto.ProductDto;
import uz.test.demo.repositry.ProductRepository;
import uz.test.demo.service.ProductService;

@SpringBootTest
public class ProductServiceTest {
    @Autowired
    ProductRepository productRepository;

    @Autowired
    ProductService productService;


    @Test
    public void CreateProductTest(){
        ProductDto productDto  =ProductDto.builder().price(123424.4).name("book").build();

        try {
            productService.create(productDto);

        }
        catch (Exception e){
            e.printStackTrace();
        }

        ProductDto productDto1name =  productDto.getName(productDto.setName());
        assertEquals(productDto.getPrice() , productDto1name.getPrice());
    }
}
