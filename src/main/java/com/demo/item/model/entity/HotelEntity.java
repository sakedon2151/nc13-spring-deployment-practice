package com.demo.item.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Table(name = "hotels")
public class HotelEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "tel")
    private String tel;

    @Column(name = "grade")
    private int grade;

    @Column(name = "detail")
    private String detail;

    // 1:N - 부모가 one, 자식이 many. hotel 이 다수의 room 을 갖게 됨으로 OneToMany
    @OneToMany(mappedBy = "hotel")
    private List<RoomEntity> rooms;
}