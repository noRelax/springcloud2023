package com.norelax.controller;

import com.norelax.entities.Payment;
import com.norelax.result.CommonResult;
import com.norelax.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wusong
 * @date 2023年02月07日 17:37
 */
@Controller
@RequestMapping("/payment")
@Slf4j
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    /**
     * 查询数据
     *
     * @param id
     * @return
     */
    @GetMapping("/get/{id}")
    public ResponseEntity<CommonResult<Payment>> getById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getById(id);
        log.info("查询结果：" + payment + "查询端口:" + serverPort);
        if (payment != null) {
            CommonResult<Payment> result = new CommonResult<Payment>(payment);
            return ResponseEntity.ok(result);
        }
        return ResponseEntity.ok(new CommonResult<Payment>(500, "数据不存在"));
    }

    /**
     * 创建订单
     *
     * @param payment
     * @return
     */
    @PostMapping("/create")
    public ResponseEntity<CommonResult> create(@RequestBody Payment payment) {
        paymentService.create(payment);
        return ResponseEntity.ok(new CommonResult(200, "创建成功"));
    }

}
