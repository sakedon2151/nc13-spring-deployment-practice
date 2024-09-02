package com.demo.item.model.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class ReviewModel {
    private Long id;
    private int rating;
    private String content;
}
