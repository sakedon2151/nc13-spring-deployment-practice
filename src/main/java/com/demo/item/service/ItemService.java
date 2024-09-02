package com.demo.item.service;

import com.demo.item.model.domain.ItemModel;
import com.demo.item.model.entity.ItemEntity;

import java.util.List;
import java.util.Optional;

public interface ItemService {

    // 레코드 속 모든 레코드 반환
    List<ItemEntity> findAll();

    // model 객체를 entity 객체로 빌드하여 엔티티에 저장하는 메서드
    ItemEntity save(ItemModel item);

    // id 값을 토대로 해당하는 레코드를 반환하는 메서드
    Optional<ItemEntity> findById(Long id);

    // 알수 없음
    boolean existsById(Long id);

    // 엔티티의 총 레코드 개수를 반환하는 메서드
    long count();

    // id 값을 토대로 해당 레코드를 삭제하는 메서드
    void deleteById(Long id);
}