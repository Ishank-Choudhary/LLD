package BehavioralPattern.StrategyPattern.withStrategy;

public class UPI implements PaymentStrategy{
    @Override
    public void processPayment(double amount) {
        System.out.println("Paid using UPI: "+amount);
    }
}
