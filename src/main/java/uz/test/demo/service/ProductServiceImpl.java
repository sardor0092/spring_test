package uz.test.demo.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import uz.test.demo.dto.ProductDto;
import uz.test.demo.entity.Product;
import uz.test.demo.exception.ProductNotFoundException;
import uz.test.demo.repositry.ProductRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;

@Service
@AllArgsConstructor
@Transactional
public class ProductServiceImpl implements ProductService {

    private  final ProductRepository productRepository;

    @Override
    void createProduct(ProductDto productDto) throws Exception {
        if(Objects.nonNull(productDto)){
            Product save = productRepository.save(proDouctTo(productDto));
            if(Objects.isNull(save.getProductId())) {
                throw  new Exception("saqlanmadi");
            }
        }

    }

    @Override
    ProductDto getProductByName(String name) {
        return productRepository.getProductByName(name)
                .map(this::proDouctTo)
                .orElse(null);
    }

    @Override
    ProductDto getProductById(Long id) throws ProductNotFoundException {
      return  productRepository.findById(id)
              .map(this::proDouctTo)
              .orElseThrow(ProductNotFoundException);
    }

    @Override
    ProductDto updateProduct(Long id, ProductDto productDto) throws Exception {
        return productRepository.findById(id)
                .map(product -> this.updateProduct());
    }

    @Override
    void deleteProductById(Long id) throws Exception {
       try {
           productRepository.deleteById(id);;
       }

       catch (Exception exception){
           throw new Exception("o'chirmadi");
       }
    }

    @Override
    List<ProductDto> getAllProduct() {
        return super.getAllProduct();
    }
}
