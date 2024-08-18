package com.DanRabadji.java_design_patterns.controller;

import com.DanRabadji.java_design_patterns.service.PaymentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/pay")
    public String makePayment(@RequestParam String type, @RequestParam double amount) {
        paymentService.processPayment(type, amount);
        return "Payment of " + amount + " via " + type + " was successful!";
    }
}
