package com.demo.item.service;

import com.demo.item.model.domain.ReviewModel;
import com.demo.item.model.entity.ReviewEntity;

import java.util.List;
import java.util.Optional;

public interface ReviewService {
    List<ReviewEntity> findAll();
    ReviewEntity save(ReviewModel review);

    Optional<ReviewEntity> findById(Long id);
    boolean existsById(Long id);

    long count();
    void deleteById(Long id);
}
