package com.example.study.model.enumclass;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum OrderStatus {

    ORDERING(0, "주문중 ", "주문 처리 중"),
    COMPLETE(1, "주문 완료", "주문 완료 상태"),
    CONFIRM(2, "배송 완료", "배송 완료된 상태")
    ;

    private Integer id;
    private String title;
    private String description;
}
