package com.demo.item.model.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class HotelModel {
    private Long id;
    private String name;
    private String tel;
    private int grade;
    private String detail;
}
