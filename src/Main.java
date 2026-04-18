import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Select Payment Method:");
    System.out.println("1: Google Pay");
    System.out.println("2: Apple Pay");
    System.out.println("3: Credit Card");
    System.out.print("Enter choice (1-3): ");
    int choice = scanner.nextInt();

    IPayment strategy;
    switch (choice) {
        case 1:
            strategy = new GooglePayPayment();
            break;
        case 2:
            strategy = new ApplePayPayment();
            break;
        case 3:
            strategy = new CreditCardPayment();
            break;
        default:
            System.out.println("Invalid choice.");
            return;
    }

    System.out.print("Enter amount: ");
    int amount = scanner.nextInt();

    Payment payment = new Payment(strategy);
    payment.pay(amount);

    scanner.close();
}

