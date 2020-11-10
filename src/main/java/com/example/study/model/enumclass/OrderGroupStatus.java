package com.example.study.model.enumclass;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum OrderGroupStatus {
    COMPLETE(0, "주문 완료", "장바구니의 모든 주문을 완료함"),
    INCOMPLETE(1, "주문 처리 중", "장바구니의 몇 품목들이 주문 처리 중임")
    ;

    private Integer id;
    private String title;
    private String description;
}
