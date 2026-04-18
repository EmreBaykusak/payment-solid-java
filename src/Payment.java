public class Payment {
    private final IPayment payment;
    public Payment(IPayment payment){
        this.payment = payment;
    }
    public void pay(){
        payment.pay();
    }
}
