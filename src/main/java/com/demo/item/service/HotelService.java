package com.demo.item.service;

import com.demo.item.model.domain.HotelModel;
import com.demo.item.model.entity.HotelEntity;

import java.util.List;
import java.util.Optional;

public interface HotelService {

    List<HotelEntity> findAll();
    HotelEntity save(HotelModel hotel);

    Optional<HotelEntity> findById(Long id);
    boolean existsById(Long id);

    long count();
    void deleteById(Long id);

}
