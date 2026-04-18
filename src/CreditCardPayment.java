public class CreditCardPayment implements IPayment{
    @Override
    public void pay() {
        System.out.println("Paying with Credit Card");
    }
}
