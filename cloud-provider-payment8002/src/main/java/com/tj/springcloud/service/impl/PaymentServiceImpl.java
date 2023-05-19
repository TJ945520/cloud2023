package com.tj.springcloud.service.impl;

import com.tj.springcloud.entities.Payment;
import com.tj.springcloud.mapper.PaymentMapper;
import com.tj.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentMapper paymentMapper;

    public int create(Payment payment){
        return paymentMapper.create(payment);
    };

    public Payment getPaymentById(Long id){
        return paymentMapper.getPaymentById(id);
    };

}
