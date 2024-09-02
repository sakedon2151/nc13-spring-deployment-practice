package com.demo.item.controller;

import com.demo.item.model.domain.ItemModel;
import com.demo.item.model.entity.ItemEntity;
import com.demo.item.service.ItemService;
import com.demo.item.util.PageProxy;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Tag(name = "Item", description = "Item Service API")
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/items") // api = lb ~ gateway(퍼사드) 필터를 통과하기 위한 값
public class ItemController {

    private final ItemService itemService;

    // - Rest Api 의 return 값 = ResponseEntity.ok
    // - Controller 는 단순한 return 코딩만 진행한다. 로직은 Service Impl 에서 구현할 것
    // - Mapping 의 네이밍은 간결하게 한다.
    // - Http Method 양식을 준수해야 한다.(GET, POST, PUT, DELETE)

    @GetMapping("/list")
    public ResponseEntity<List<ItemEntity>> getList() {
        return ResponseEntity.ok(itemService.findAll());
    }

    @PostMapping("")
    public ItemEntity save(@RequestBody ItemModel model) {
        return itemService.save(model);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<ItemEntity>> getById(@PathVariable Long id) {
        return ResponseEntity.ok(itemService.findById(id));
    }

    @GetMapping("existsById")
    public boolean existsById(Long id) {
        return itemService.existsById(id);
    }

    @GetMapping("count")
    public long count() {
        return itemService.count();
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        itemService.deleteById(id);
    }
}
