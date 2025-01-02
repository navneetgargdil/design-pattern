package BehaviouralPatterns.Strategy;

// Strategy Interface
interface PaymentStrategy {
    void processPayment();
}

// Context
class PaymentService {
    // interface
    private PaymentStrategy strategy;
    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }
    public void pay(){
        strategy.processPayment(); // Polymorphic behavior
    }
}

// Concrete Strategy for Credit Card
class CreditCard implements PaymentStrategy  {

    @Override
    public void processPayment() {
        System.out.println("Payment done by Credit Card");
    }
}

// Concrete Strategy for Credit Card
class DebitCard implements PaymentStrategy  {

    @Override
    public void processPayment() {
        System.out.println("Payment done by Debit Card");
    }

}

// Concrete Strategy for Credit Card
class UPICard implements PaymentStrategy  {

    @Override
    public void processPayment() {
        System.out.println("Payment done by UPI");
    }

}

// Client component
public class Strategy {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();

        paymentService.setPaymentStrategy(new UPICard());

        paymentService.pay();

        
    }
    
}
