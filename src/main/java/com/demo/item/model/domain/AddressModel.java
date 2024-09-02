package com.demo.item.model.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class AddressModel {
    private Long id;
    private String address;
    private String addressDetail;
    private String postCode;
    private double latitude;
    private double longitude;
}
