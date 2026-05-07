package com.dj.springeccom.Model.dto;

import java.util.List;

public record OrderRequest(
    String customerName,
    String email,
    List<OrderItemRequest> items
) {
    
}
