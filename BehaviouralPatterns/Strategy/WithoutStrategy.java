package BehaviouralPatterns.Strategy;
// Break Open Closed Principle if you want to add new payment method.
class PaymentServiceWithoutStrategy {

    public void processPayment(String paymentType) {
        if (paymentType == "CC") {
            System.out.println("Payment made by Credit Card");
            
        } else if (paymentType == "DC") {
            System.out.println("Payment made by Debit Card");
        } else if (paymentType == "new method") {
            // required modify main class
        } else {
            System.out.println("Unsupported Payment method");
        }

    }
    
}
public class WithoutStrategy {
    public static void main(String[] args) {
        PaymentServiceWithoutStrategy paymentService = new PaymentServiceWithoutStrategy();
        paymentService.processPayment("CC");
    }
}
