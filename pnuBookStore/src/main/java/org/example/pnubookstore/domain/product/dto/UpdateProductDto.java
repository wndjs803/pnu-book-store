package org.example.pnubookstore.domain.product.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.example.pnubookstore.domain.product.entity.constant.SaleStatus;
import org.example.pnubookstore.domain.product.entity.constant.UseStatus;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class UpdateProductDto {

    private String sellerEmail;
    private String productName;
    private Integer price;
    private String description;
    private String author;
    private LocalDateTime pubDate;
    private Boolean isBargain;
    private String canBargainReason;
    private SaleStatus saleStatus;
    private UseStatus underline;
    private UseStatus note;
    private Boolean naming;
    private Boolean discolor;
    private Boolean damage;

    private String subjectName;
    private String professor;
    private String department;

    // 이미지 추후 추가 예정
}
