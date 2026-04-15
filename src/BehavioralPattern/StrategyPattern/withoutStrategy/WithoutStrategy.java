package BehavioralPattern.StrategyPattern.withoutStrategy;

class PaymentService{

    public void processPayment(String paymentMethod){
        if(paymentMethod.equals("Credit Card")){
            System.out.println("We are paying using Credit card");
        } else if (paymentMethod.equals("Debit Card")) {
            System.out.println("We are paying using Debit card");
        } else if (paymentMethod.equals("UPI")) {
            System.out.println("We are paying using UPI");
        }
    }
}

public class WithoutStrategy {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.processPayment("Credit Card");
    }
}
