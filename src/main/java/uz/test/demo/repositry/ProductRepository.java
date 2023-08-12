package uz.test.demo.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.test.demo.entity.Product;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product ,Long> {

    Optional<Product> getProductByName(String name);
}
