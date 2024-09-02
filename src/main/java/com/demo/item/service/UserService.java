package com.demo.item.service;


import com.demo.item.model.domain.UserModel;
import com.demo.item.model.entity.UserEntity;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface UserService {
    List<UserEntity> findAll();
    UserEntity save(UserModel review);

    Optional<UserEntity> findById(Long id);
    boolean existsById(Long id);

    long count();
    void deleteById(Long id);

//    Map<?,?> login(UserModel user);
}
