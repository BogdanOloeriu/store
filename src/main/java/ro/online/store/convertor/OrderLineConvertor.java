package ro.online.store.convertor;

import ro.online.store.dto.OrderLineDTO;
import ro.online.store.dto.OrderLineInfoDTO;
import ro.online.store.entity.OrderEntity;
import ro.online.store.entity.OrderLineEntity;

public class OrderLineConvertor {

    public static OrderLineEntity map(OrderLineDTO orderLineDTO){
        return new OrderLineEntity(
                ProductConvertor.map(orderLineDTO.getProductDto()),
                orderLineDTO.getNumberOfProducts());
    }

    public static OrderLineDTO map(OrderLineEntity orderLineEntity){
        return new OrderLineDTO(
                ProductConvertor.map(orderLineEntity.getProduct()),
                orderLineEntity.getNumberOfProducts());
    }

    public static OrderLineInfoDTO mapInfoDTO(OrderLineEntity orderLineEntity){
        return new OrderLineInfoDTO(
                orderLineEntity.getId(),
                ProductConvertor.mapInfoDTO(orderLineEntity.getProduct()),
                orderLineEntity.getNumberOfProducts());
    }
}
