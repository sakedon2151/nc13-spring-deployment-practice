package com.demo.item.service.impl;

import com.demo.item.model.domain.ReviewModel;
import com.demo.item.model.entity.ReviewEntity;
import com.demo.item.model.repository.ReviewRepository;
import com.demo.item.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Transactional
@Service
public class ReviewServiceImpl implements ReviewService {
    private final ReviewRepository reviewRepository;

    @Override
    public List<ReviewEntity> findAll() {
        return reviewRepository.findAll();
    }

    @Override
    public ReviewEntity save(ReviewModel review) {
        ReviewEntity entity = ReviewEntity.builder()
                .rating(review.getRating())
                .content(review.getContent())
                .build();
        return reviewRepository.save(entity);
    }

    @Override
    public Optional<ReviewEntity> findById(Long id) {
        return reviewRepository.findById(id);
    }

    @Override
    public boolean existsById(Long id) {
        return reviewRepository.existsById(id);
    }

    @Override
    public long count() {
        return reviewRepository.count();
    }

    @Override
    public void deleteById(Long id) {
        reviewRepository.deleteById(id);
    }
}
