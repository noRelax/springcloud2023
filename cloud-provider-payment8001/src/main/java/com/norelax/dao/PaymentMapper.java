package com.norelax.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.norelax.entities.Payment;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author wusong
 * @date 2023年02月07日 17:05
 */
@Mapper
public interface PaymentMapper extends BaseMapper<Payment> {
}
