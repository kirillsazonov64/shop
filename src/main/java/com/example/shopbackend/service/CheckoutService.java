package com.example.shopbackend.service;


import com.example.shopbackend.dto.PaymentInfo;
import com.example.shopbackend.dto.Purchase;
import com.example.shopbackend.dto.PurchaseResponse;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);

    PaymentIntent createPaymentIntent(PaymentInfo paymentInfo) throws StripeException;
}
