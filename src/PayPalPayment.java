public class PayPalPayment implements IPayment {
    @Override
    public void pay(int amount) {
        System.out.println("Paying " + amount + " with PayPal.");
    }
}
