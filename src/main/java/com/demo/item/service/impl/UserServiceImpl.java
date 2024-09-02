package com.demo.item.service.impl;

import com.demo.item.model.domain.UserModel;
import com.demo.item.model.entity.UserEntity;
import com.demo.item.model.repository.UserRepository;
import com.demo.item.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RequiredArgsConstructor
@Transactional
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public List<UserEntity> findAll() {
        return userRepository.findAll();
    }

    @Override
    public UserEntity save(UserModel user) {
        UserEntity entity = UserEntity.builder()
                .email(user.getEmail())
                .password(user.getPassword())
                .nickname(user.getNickname())
                .tel(user.getTel())
                .grade(user.getGrade())
                .build();
        return userRepository.save(entity);
    }

    @Override
    public Optional<UserEntity> findById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public boolean existsById(Long id) {
        return userRepository.existsById(id);
    }

    @Override
    public long count() {
        return userRepository.count();
    }

    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }

//    @Override
//    public Map<?, ?> login(UserModel user) {
//        Map<?,?> map = userRepository.login(user);
//        return map;
//    }
}
