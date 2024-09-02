package com.demo.item.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Table(name = "rooms")
public class RoomEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private int price;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "detail")
    private String detail;

    @Column(name = "max_people")
    private int maxPeople;

    // N:1 - 자식 room 이 다수가 됨. 부모에 대한 PK 값을 가지기 위해 JoinColumn 필요
    @ManyToOne
    @JoinColumn(name = "hotel_id")
    private HotelEntity hotel;
}

