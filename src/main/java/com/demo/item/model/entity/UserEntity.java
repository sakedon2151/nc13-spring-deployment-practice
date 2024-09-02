package com.demo.item.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Table(name = "users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
    private Long id;

//    @Column(name = "email")
    private String email;

//    @Column(name = "password")
    private String password;

//    @Column(name = "nickname")
    private String nickname;

//    @Column(name = "tel")
    private String tel;

//    @Column(name = "grade")
    private String grade;
}
