public class Payment {
    private final IPayment payment;
    public Payment(IPayment payment){
        this.payment = payment;
    }
    public void pay(int amount){
        payment.pay(amount);
    }
}
