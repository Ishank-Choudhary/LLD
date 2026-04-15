package BehavioralPattern.StrategyPattern.withStrategy;


public class Main {
    public static void main(String[] args) {
        PaymentStrategy creditCard = new CreditCard();
        PaymentService ps = new PaymentService(creditCard);
        ps.pay(234);
    }
}
