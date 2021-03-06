package com.meerim_task.demo.domain.request;

import com.meerim_task.demo.domain.ServiceProvider;
import com.meerim_task.demo.domain.StatusType;
import com.meerim_task.demo.domain.UserBalance;
import lombok.RequiredArgsConstructor;
import lombok.Value;

@RequiredArgsConstructor
@Value
public class CreatePaymentTransactionRequest {
    UserBalance userBalance;
    ServiceProvider serviceProvider;
    Integer amount;
    StatusType statusType = StatusType.PENDING;
}
