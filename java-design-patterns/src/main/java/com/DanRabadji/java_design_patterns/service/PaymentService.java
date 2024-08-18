package com.DanRabadji.java_design_patterns.service;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    private PaymentContext paymentContext;

    public PaymentService() {
        this.paymentContext = new PaymentContext();
    }

    public void processPayment(String paymentType, double amount) {
        switch (paymentType.toLowerCase()) {
            case "creditcard":
                paymentContext.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456"));
                break;
            case "paypal":
                paymentContext.setPaymentStrategy(new PaypalPayment("user@example.com"));
                break;
            case "bitcoin":
                paymentContext.setPaymentStrategy(new BitcoinPayment("1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa"));
                break;
            default:
                throw new IllegalArgumentException("Invalid payment type");
        }
        paymentContext.pay(amount);
    }
}
