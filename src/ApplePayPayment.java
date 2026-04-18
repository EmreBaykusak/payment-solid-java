public class ApplePayPayment implements IPayment{
    @Override
    public void pay() {
        System.out.println("Paying with Apple Pay");
    }
}
