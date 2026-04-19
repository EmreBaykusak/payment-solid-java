import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);

    while(true){
        System.out.println("Select Payment Method:");
        System.out.println("1: Google Pay");
        System.out.println("2: Apple Pay");
        System.out.println("3: Credit Card");
        System.out.println("4: PayPal");
        System.out.println("0: Exit");
        System.out.print("Enter Payment Method: ");

        if (!scanner.hasNextInt()) {
            System.out.println("Invalid payment method. Please enter a number.");
            scanner.next();
            continue;
        }

        int choice = scanner.nextInt();
        if (choice == 0) break;

        String strategy = switch (choice) {
            case 1 -> "GooglePay";
            case 2 -> "ApplePay";
            case 3 -> "CreditCard";
            case 4 -> "PayPal";
            default -> null;
        };

        System.out.print("Enter amount: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid amount. Please enter a number.");
            scanner.next();
            continue;
        }
        int amount = scanner.nextInt();

        try {
            PaymentFactory paymentFactory = new PaymentFactory();
            IPayment paymentType = paymentFactory.createPayment(strategy);
            Payment payment = new Payment(paymentType);
            payment.pay(amount);
        } catch (Exception _) {
            System.err.println("Error processing payment: Payment method not found." );
        }
    }

    scanner.close();
    System.out.println("Program exited.");
}

