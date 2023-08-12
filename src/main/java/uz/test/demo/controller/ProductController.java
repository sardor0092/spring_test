package uz.test.demo.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.test.demo.dto.ProductDto;
import uz.test.demo.entity.Product;
import uz.test.demo.service.ProductService;

@RestController
@RequestMapping("/api/product")
@AllArgsConstructor
public class ProductController {



    private final ProductService productService;

    @PostMapping
    public ResponseEntity<?> createProduct(@RequestBody ProductDto productDto) throws Exception {

        try {
            productService.createProduct(productDto);
            return ResponseEntity.status(HttpStatus.CREATED).build();
        }

        catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

    };



}
