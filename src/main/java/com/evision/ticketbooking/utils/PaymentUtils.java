package com.evision.ticketbooking.utils;

import java.util.*;

public class PaymentUtils {
    public static Map<Integer , Integer> paymentMap = new HashMap<>();

    static{
        paymentMap.put(1, 50000);
        paymentMap.put(2, 10000);
        paymentMap.put(3, 90000);
        paymentMap.put(4, 20000);
        paymentMap.put(5, 60000);
        paymentMap.put(6, 70000);
    }

    public static boolean validateCreditLimit(int accNo, int paidAmount){
        if (paidAmount>paymentMap.get(accNo)){
            throw new RuntimeException("Credit limit Exceeds");
        }
        else{
            return true;
        }
    }
}
