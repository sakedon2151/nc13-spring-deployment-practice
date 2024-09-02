package com.demo.item.service.impl;

import com.demo.item.model.domain.HotelModel;
import com.demo.item.model.entity.HotelEntity;
import com.demo.item.model.repository.HotelRepository;
import com.demo.item.service.HotelService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Transactional
@Service
public class HotelServiceImpl implements HotelService {

    private final HotelRepository hotelRepository;

    @Override
    public List<HotelEntity> findAll() {
        return hotelRepository.findAll();
    }

    @Override
    public HotelEntity save(HotelModel model) {
        HotelEntity entity = HotelEntity.builder()
                .name(model.getName())
                .tel(model.getTel())
                .grade(model.getGrade())
                .detail(model.getDetail())
                .build();
        return hotelRepository.save(entity);
    }

    @Override
    public Optional<HotelEntity> findById(Long id) {
        return hotelRepository.findById(id);
    }

    @Override
    public boolean existsById(Long id) {
        return hotelRepository.existsById(id);
    }

    @Override
    public long count() {
        return hotelRepository.count();
    }

    @Override
    public void deleteById(Long id) {
        hotelRepository.deleteById(id);
    }
}
