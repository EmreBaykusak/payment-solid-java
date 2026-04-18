public class GooglePayPayment implements IPayment{
    @Override
    public void pay(int amount) {
        System.out.println("Paying " + amount + " with Google Pay.");
    }
}
