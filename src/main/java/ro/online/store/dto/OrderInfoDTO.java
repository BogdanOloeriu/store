package ro.online.store.dto;

import lombok.*;
import ro.online.store.utils.Status;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class OrderInfoDTO {

    private Integer id;
    private String userName;
    private Double totalCost;
    private String deliveryAddress;
    private String userAddress;
    private String dateOfSubmission;
    private List<OrderLineInfoDTO> orderLineInfoDTOList;
    private Status status;


    public OrderInfoDTO(
            String userName,
            String deliveryAddress,
            String userAddress,
            String dateOfSubmission,
            List<OrderLineInfoDTO> orderLineInfoDTOList,
            Status status) {
        this.userName = userName;
        this.totalCost = calculateTotalCost(orderLineInfoDTOList);
        this.deliveryAddress = deliveryAddress;
        this.userAddress = userAddress;
        this.dateOfSubmission = dateOfSubmission;
        this.orderLineInfoDTOList = orderLineInfoDTOList;
        this.status = status;
    }

    private static Double calculateTotalCost(List<OrderLineInfoDTO> orderLineInfoDTOList){
        double totalPrice = 0.0;
        if(!orderLineInfoDTOList.isEmpty()){
            for(int i = 0; i< orderLineInfoDTOList.size(); i++){
                totalPrice = totalPrice +
                        (orderLineInfoDTOList.get(i).getPrice()* orderLineInfoDTOList.get(i).getNumberOfProducts());
            }
            return totalPrice;
        }
        return totalPrice;
    }
}
