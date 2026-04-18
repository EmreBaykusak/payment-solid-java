void main() {
    Payment payment = new Payment(new GooglePayPayment());
    payment.pay();

    Payment payment2 = new Payment(new ApplePayPayment());
    payment2.pay();

    Payment payment3 = new Payment(new CreditCardPayment());
    payment3.pay();
}
