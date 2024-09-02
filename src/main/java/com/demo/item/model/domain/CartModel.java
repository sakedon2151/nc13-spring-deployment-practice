package com.demo.item.model.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
@Data
public class CartModel {
    private Long id;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
}
