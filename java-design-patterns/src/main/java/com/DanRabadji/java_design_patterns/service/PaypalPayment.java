package com.DanRabadji.java_design_patterns.service;

public class PaypalPayment implements PaymentStrategy {
    private String email;

    public PaypalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using PayPal: " + email);
    }
}
