package com.demo.item.controller;

import com.demo.item.model.domain.HotelModel;
import com.demo.item.model.entity.HotelEntity;
import com.demo.item.service.HotelService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Controller
@RequestMapping("/hotel/")
public class HotelController {

    private final HotelService hotelService;

    @GetMapping("findAll")
    public List<HotelEntity> findAll() {
        return hotelService.findAll();
    }

    @PostMapping("save")
    public HotelEntity save(HotelModel hotel) {
        return hotelService.save(hotel);
    }

    @GetMapping("findById")
    public Optional<HotelEntity> findById(Long id) {
        return hotelService.findById(id);
    }

    @GetMapping("existsById")
    public boolean existsById(Long id) {
        return hotelService.existsById(id);
    }

    @GetMapping("count")
    public long count() {
        return hotelService.count();
    }

    @GetMapping("deleteById")
    public void deleteById(Long id) {
        hotelService.deleteById(id);
    }
}
