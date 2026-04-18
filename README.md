### Project README

This project is a simple Java implementation demonstrating the **Strategy Design Pattern** for various payment methods.

### Overview

The system allows processing payments through different channels (Google Pay, Apple Pay, and Credit Card) using a unified interface. This design promotes flexibility and decoupled code, making it easy to add new payment methods without modifying existing logic.

### How to Run

1.  Ensure you have a Java Development Kit (JDK) installed (version 21 or higher recommended for `void main()` support).
2.  Compile the source files:
    ```bash
    javac src/*.java
    ```
3.  Run the application:
    ```bash
    java src/Main.java
    ```

### Example Usage

```java
Payment payment = new Payment(new GooglePayPayment());
payment.pay(); // Outputs: Paying with Google Pay
```