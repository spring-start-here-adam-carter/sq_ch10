package com.example.sq_ch10.services;

import com.example.sq_ch10.exceptions.NotEnoughMoneyException;
import com.example.sq_ch10.model.PaymentDetails;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    public PaymentDetails processPayment() {
        throw new NotEnoughMoneyException();
    }
}
