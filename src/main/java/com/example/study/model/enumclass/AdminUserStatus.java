package com.example.study.model.enumclass;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum AdminUserStatus {

    REGISTERED(0, "등록", "관리자 등록 상태"),
    UNREGISTERED(1, "미등록", "관리작 미등록 상태")
    ;

    private Integer id;
    private String title;
    private String description;
}
