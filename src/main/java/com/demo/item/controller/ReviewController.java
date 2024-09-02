package com.demo.item.controller;

import com.demo.item.model.domain.ReviewModel;
import com.demo.item.model.entity.ReviewEntity;
import com.demo.item.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Controller
@RequestMapping("/review/")
public class ReviewController {

    private final ReviewService reviewService;

    @GetMapping("findAll")
    public List<ReviewEntity> findAll() {
        return reviewService.findAll();
    }

    @PostMapping("save")
    public ReviewEntity save(ReviewModel review) {
        return reviewService.save(review);
    }

    @GetMapping("findById")
    public Optional<ReviewEntity> findById(Long id) {
        return reviewService.findById(id);
    }

    @GetMapping("existsById")
    public boolean existsById(Long id) {
        return reviewService.existsById(id);
    }

    @GetMapping("count")
    public long count() {
        return reviewService.count();
    }

    @GetMapping("deleteById")
    public void deleteById(Long id) {
        reviewService.deleteById(id);
    }
}
