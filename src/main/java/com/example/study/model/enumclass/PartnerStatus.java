package com.example.study.model.enumclass;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum PartnerStatus {

    REGISTERED(0, "등록", "등록 된 상태"),
    UNREGISTERED(1, "등록 안됨", "등록 안된 상태")
    ;

    private Integer id;
    private String title;
    private String description;
}
