package BehavioralPattern.StrategyPattern.withStrategy;

public class PaymentService {
    private PaymentStrategy strategy;

    public PaymentService(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void pay(double amount){
        strategy.processPayment(amount);
    }
}
