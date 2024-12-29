package com.yuns.weather.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "memo")
public class Memo {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY) // 기본적인 키 생성을 db에 맡김
    private int id;

    private String text;
}
