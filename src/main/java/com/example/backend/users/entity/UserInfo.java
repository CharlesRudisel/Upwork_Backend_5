package com.example.backend.users.entity;

import com.example.backend.security.enums.Role;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users_table")
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column
    private String username;
    @Column
    private String password;
    @Column
    private String email;
    @Column
    @Enumerated
    private Role role;


}
