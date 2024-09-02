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
@Table(name = "addresses")
public class AddressEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
    private Long id;

//    @Column(name = "address")
    private String address;

//    @Column(name = "address_detail")
    private String addressDetail;

//    @Column(name = "post_code")
    private String postCode;

//    @Column(name = "latitude")
    private double latitude;

//    @Column(name = "longitude")
    private double longitude;
}
