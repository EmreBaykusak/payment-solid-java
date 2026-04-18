public class ApplePayPayment implements IPayment{
    @Override
    public void pay(int amount) {
        System.out.println("Paying " + amount + " with Apple Pay.");
    }
}
