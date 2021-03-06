package com.meerim_task.demo.controller.dto;

import lombok.RequiredArgsConstructor;
import lombok.Value;

import javax.validation.constraints.NotNull;

@Value
@RequiredArgsConstructor
public class CancelPaymentTransactionRequestDto {
    @NotNull
    Long userBalanceId;
    @NotNull
    Long serviceProviderId;
}
