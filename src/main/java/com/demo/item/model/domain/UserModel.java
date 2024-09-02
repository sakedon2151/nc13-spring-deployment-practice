package com.demo.item.model.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class UserModel {
    private Long id;
    private String email;
    private String password;
    private String nickname;
    private String tel;
    private String grade;
}
