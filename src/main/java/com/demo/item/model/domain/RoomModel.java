package com.demo.item.model.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class RoomModel {
    private Long id;
    private String name;
    private int price;
    private int quantity;
    private String detail;
    private int maxPeople;
}
