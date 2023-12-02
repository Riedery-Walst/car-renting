package com.example.naumenwebproject.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class OrderItemDto {
    private Long id;
    private LocalDateTime expireTime;
    private Boolean expired;
}
