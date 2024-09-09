package com.demo.item.controller;

import com.demo.item.model.domain.ItemModel;
import com.demo.item.model.entity.ItemEntity;
import com.demo.item.service.ItemService;
import com.demo.item.service.WebScrapingService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000/")
@Tag(name = "Item", description = "Item Service API")
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/items") // api = lb ~ gateway(퍼사드) 필터를 통과하기 위한 값
public class ItemController {

    private final ItemService itemService;
    private final WebScrapingService webScrapingService;

    // - Rest Api 의 return 값 = ResponseEntity.ok
    // - Controller 는 단순한 return 코딩만 진행한다. 로직은 Service Impl 에서 구현할 것
    // - Mapping 의 네이밍은 간결하게 한다.
    // - Http Method 양식을 준수해야 한다.(GET, POST, PUT, DELETE)

    // Get all items
    @GetMapping("")
    public ResponseEntity<List<ItemEntity>> getAllItems() {
        return ResponseEntity.ok(itemService.findAll());
    }

    // Get a single item
    @GetMapping("/{id}")
    public ResponseEntity<Optional<ItemEntity>> getItem(@PathVariable Long id) {
        return ResponseEntity.ok(itemService.findById(id));
    }

    // Check if it exists
    @GetMapping("/existsById")
    public ResponseEntity<Boolean> existsById(Long id) {
        return ResponseEntity.ok(itemService.existsById(id));
    }

    // Count items
    @GetMapping("/count")
    public long countItems() {
        return itemService.count();
    }

    // Create a new item
    @PostMapping("")
    public ItemEntity createItem(@RequestBody ItemModel model) {
        return itemService.save(model);
    }

    // Update an existing item
    @PutMapping("/{id}")
    public ItemEntity updateItem(@PathVariable Long id, @RequestBody ItemModel model) {
        model.setId(id);
        return itemService.save(model);
    }

    // Delete an item
    @DeleteMapping("/{id}")
    public void deleteItem(@PathVariable Long id) {
        itemService.deleteById(id);
    }

    @GetMapping("/scrape")
    public String scrapSite(@RequestParam String url) {
        webScrapingService.jsoupScrapeWebsite(url); // Jsoup 스크래핑
        return webScrapingService.seleniumScrapeWebsite(url); // selenium 스크래핑
    }
}
