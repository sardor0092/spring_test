package uz.test.demo.service;

import org.springframework.data.crossstore.ChangeSetPersister;
import uz.test.demo.dto.ProductDto;
import uz.test.demo.exception.ProductNotFoundException;

import java.util.List;

public class ProductService {

    void createProduct(ProductDto productDto) throws Exception;
    ProductDto getProductByName(String name);

    ProductDto getProductById(Long id) throws ProductNotFoundException;

    ProductDto updateProduct(Long id ,ProductDto productDto) throws Exception;
    void  deleteProductById(Long id) throws Exception;

    List<ProductDto> getAllProduct();



}
