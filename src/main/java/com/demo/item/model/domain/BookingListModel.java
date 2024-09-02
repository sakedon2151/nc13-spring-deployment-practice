package com.demo.item.model.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
@Data
public class BookingListModel {
    private Long id;
    private Boolean cancel;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private int totalPrice;
    private int totalPeople;
}
