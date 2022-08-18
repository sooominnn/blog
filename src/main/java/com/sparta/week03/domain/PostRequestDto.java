package com.sparta.week03.domain;

import lombok.Getter;

@Getter
public class PostRequestDto {
    private String username;
    private String contents;
    private String password;
    private String title;
}