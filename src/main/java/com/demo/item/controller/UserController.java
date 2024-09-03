package com.demo.item.controller;

import com.demo.item.model.domain.UserModel;
import com.demo.item.model.entity.UserEntity;
import com.demo.item.model.repository.UserRepository;
import com.demo.item.service.UserService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000/")
@Tag(name = "User", description = "User Service API")
@RequiredArgsConstructor
@RestController
@RequestMapping("/user/")
public class UserController {

    private final UserService userService;
    private final UserRepository userRepository;

    // 프론트 위주 개발에서는 타입스크립트를 이용해
    // 백엔드에서 관리하는 Model 객체와 동일한 Model 을 곧바로 request 한다.
    // 여기에서는 별다른 로직이 없기 때문에 빌드된 엔티티를 곧바로 리포지토리를 통해 db에 저장했다.
    @PostMapping("join")
    public Object join(@RequestBody UserEntity entity) {
        return userRepository.save(UserEntity.builder()
                .email(entity.getTel())
                .password(entity.getPassword())
                .nickname(entity.getNickname())
                .tel(entity.getTel())
                .grade(entity.getGrade())
                .build());
    }

//    @PostMapping("login")
//    public Object login(@RequestBody UserModel user) {
//        Map<?,?> map = userService.login(user);
//        return null;
//    }

    @GetMapping("findAll")
    public List<UserEntity> findAll() {
        return userService.findAll();
    }

    @PostMapping("save")
    public UserEntity save(UserModel user) {
        return userService.save(user);
    }

    @GetMapping("findById")
    public Optional<UserEntity> findById(Long id) {
        return userService.findById(id);
    }

    @GetMapping("existsById")
    public boolean existsById(Long id) {
        return userService.existsById(id);
    }

    @GetMapping("count")
    public long count() {
        return userService.count();
    }

    @GetMapping("deleteById")
    public void deleteById(Long id) {
        userService.deleteById(id);
    }
}
