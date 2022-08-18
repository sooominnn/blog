package com.sparta.week03.domain;

import java.time.LocalDateTime;

public interface OnlyPostList {
    //제목, 작성자명,작성 날짜
    Long getId();
    String getTitle();
    String getUsetname();
    LocalDateTime getCreateAt();
}
