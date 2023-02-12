package com.norelax.service;

import com.norelax.dao.PaymentMapper;
import com.norelax.entities.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wusong
 * @date 2023年02月07日 17:34
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentMapper paymentMapper;


    public void create(Payment payment) {
        paymentMapper.insert(payment);
    }

    public Payment getById(Long id) {
        return paymentMapper.selectById(id);
    }

}
