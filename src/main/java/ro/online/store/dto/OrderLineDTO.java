package ro.online.store.dto;

import jakarta.validation.constraints.NotNull;
import lombok.*;
import ro.online.store.entity.ProductEntity;


@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class OrderLineDTO {

    private ProductDTO productDto;
    @NotNull(message = "Number of products must not be null")
    private Integer numberOfProducts;
    @NotNull(message = "Price is mandatory")
    private Double price;

    public OrderLineDTO(ProductDTO productDto, Integer numberOfProducts) {
        this.productDto = productDto;
        this.numberOfProducts = numberOfProducts;
        this.price = productDto.getPrice();
    }
}
