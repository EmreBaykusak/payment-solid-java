public class PaymentFactory {
    public IPayment createPayment(String paymentType) throws RuntimeException {
        String className = paymentType + "Payment";
        Class<? extends IPayment> paymentClass;

        try {
            paymentClass = Class.forName(className).asSubclass(IPayment.class);
            return paymentClass.getDeclaredConstructor().newInstance();
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException(e);
        }
    }
}