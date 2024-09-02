package com.demo.item.model.repository;

import com.demo.item.model.domain.UserModel;
import com.demo.item.model.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Map;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
//    Map<?,?> login(UserModel user);
}
