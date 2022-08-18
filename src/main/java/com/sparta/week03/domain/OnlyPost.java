package com.sparta.week03.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface OnlyPost {
    //제목, 작성자명, 비밀번호, 작성내용
    Long getId();
    String getTitle();
    String getUsetname();
    String getPassword();
    String getContents();
}
