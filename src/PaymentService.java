public class PaymentService {
    public boolean pay(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid payment amount!");
            return false;
        }
        System.out.println("Payment successful: "+amount +" KZT");
        return true;
    }
}