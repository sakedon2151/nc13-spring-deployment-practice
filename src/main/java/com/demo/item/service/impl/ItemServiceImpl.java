package com.demo.item.service.impl;

import com.demo.item.model.domain.ItemModel;
import com.demo.item.model.entity.ItemEntity;
import com.demo.item.model.repository.ItemRepository;
import com.demo.item.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Transactional
@Service
public class ItemServiceImpl implements ItemService {

    private final ItemRepository itemRepository;

    @Override
    public List<ItemEntity> findAll() {
        return itemRepository.findAll();
    }

    @Override
    public ItemEntity save(ItemModel model) {
        ItemEntity entity = ItemEntity.builder()
                .name(model.getName())
                .quantity(model.getQuantity())
                .build();
        return itemRepository.save(entity);
    }

    @Override
    public Optional<ItemEntity> findById(Long id) {
        return itemRepository.findById(id);
    }

    @Override
    public Boolean existsById(Long id) {
        return itemRepository.existsById(id);
    }

    @Override
    public long count() {
        return itemRepository.count();
    }

    @Override
    public void deleteById(Long id) {
        itemRepository.deleteById(id);
    }

}
