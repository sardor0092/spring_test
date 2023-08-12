package uz.test.demo.dto;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.io.Serializable;
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor
@Data
@Builder
public class ProductDto  implements Serializable {

    private Long productId;
    private  String name;
    private  Double price;
}
