package BehavioralPattern.StrategyPattern.withStrategy;

public class DebitCard implements PaymentStrategy{
    @Override
    public void processPayment(double amount) {
        System.out.println("Paid using UPI: "+amount);
    }
}
