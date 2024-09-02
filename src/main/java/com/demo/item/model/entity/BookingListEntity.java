package com.demo.item.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Table(name = "booking_lists")
public class BookingListEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
    private Long id;

//    @Column(name = "cancel")
    private Boolean cancel;

//    @Column(name = "check_in_date")
    private LocalDate checkInDate;

//    @Column(name = "check_out_date")
    private LocalDate checkOutDate;

//    @Column(name = "total_price")
    private int totalPrice;

//    @Column(name = "total_people")
    private int totalPeople;

}