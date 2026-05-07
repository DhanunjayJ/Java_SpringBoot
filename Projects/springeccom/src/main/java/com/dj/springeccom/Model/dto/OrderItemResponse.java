package com.dj.springeccom.Model.dto;

import java.math.BigDecimal;

public record OrderItemResponse(
    String productName,
    Integer quantity,
    BigDecimal totalPrice
) {
    
}
