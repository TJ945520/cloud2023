package com.tj.springcloud.mapper;

import com.tj.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentMapper {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
