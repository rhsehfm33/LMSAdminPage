package com.example.study.model.enumclass;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum PaymentType {

    BANK_TRANSFER(0, "계좌 이체", "계좌 이체"),
    CARD(1, "카드", "카드 결제"),
    CHECK_CARD(2, "체크 카드", "체크 카드 결제")
    ;

    private Integer id;
    private String title;
    private String description;
}
