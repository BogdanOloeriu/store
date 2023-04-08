package ro.online.store.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ro.online.store.utils.ProductType;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductInfoDTO {

    private Integer id;

    private String description;
    private String thumbnail;
    private CategoryInfoDTO categoryInfoDTO;

    private Double price;
    private ProductType productType;
    private List<ManufacturerInfoDTO> manufacturerInfoDTOList;
}
