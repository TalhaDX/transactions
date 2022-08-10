package com.example.transaction.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "userInfo")
public class UserInfo {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String email;

    private Double fare;

}
