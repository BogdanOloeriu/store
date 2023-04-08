package ro.online.store.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ro.online.store.entity.ProductEntity;

@Data
@NoArgsConstructor
public class OrderLineInfoDTO {

    private Integer id;
    private ProductInfoDTO product;

    private Integer numberOfProducts;

    private Double price;

    public OrderLineInfoDTO(Integer id, ProductInfoDTO product, Integer numberOfProducts) {
        this.id = id;
        this.product = product;
        this.numberOfProducts = numberOfProducts;
        this.price = product.getPrice();
    }
}
