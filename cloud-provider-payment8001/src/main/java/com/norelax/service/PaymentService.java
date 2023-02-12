package com.norelax.service;

import com.norelax.entities.Payment;

/**
 * @author wusong
 * @create 2023-02-07 17:32
 **/
public interface PaymentService {
    void create(Payment payment);

    Payment getById(Long id);
}
