package com.example.study.model.enumclass;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum OrderDetailStatus {

    REFUND(0, "환불", "환불 완료 상태"),
    WAITING(1, "배송 중", "배송 중인 상태"),
    COMPLETE(2, "배송 완료", "배송 완료된 상태")
    ;

    private Integer id;
    private String title;
    private String description;
}
