package service;

import model.Payment;

import java.util.ArrayList;
import java.util.List;

public class PaymentService {

    private static final List<Payment> paymentDb = new ArrayList<>();



    public void savePayment(Payment payment){
        paymentDb.add(payment);
        System.out.println(payment);
    }

    public int passId(){
        return  paymentDb.size();
    }

    public void updatePayment(Payment payment){

    }

}
