package com.food.ordering.system.order.service.application.exception.handler;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ErrorDTO {

    private String code;
    private String message;
}
