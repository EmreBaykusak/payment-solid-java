# Ödeme Yöntemi Entegrasyonu (SOLID Prensipleri ile)

Bu proje, bir ödeme ekranı uygulamasında yeni bir ödeme yönteminin SOLID prensiplerine uygun olarak nasıl entegre edileceğini göstermektedir.

## Tasarım Kararları ve Yaklaşım

Projeyi geliştirirken aşağıdaki tasarım kararları alınmıştır:

### Strateji Tasarım Deseni (Strategy Design Pattern)
Ödeme yöntemleri, `IPayment` arayüzünü (interface) uygulayan farklı sınıflar olarak tanımlanmıştır. Bu sayede uygulama, çalışma anında (runtime) hangi ödeme yönteminin kullanılacağını esnek bir şekilde belirleyebilir.

### Fabrika Tasarım Deseni (Factory Design Pattern)
`PaymentFactory` sınıfı, belirtilen strateji ismine göre uygun `IPayment` nesnesini oluşturmakla sorumludur. Bu sayede nesne oluşturma mantığı `Main` sınıfından ayrıştırılmış olur.


## Nasıl Çalıştırılır?

1.  Java JDK (versiyon 21 veya üstü önerilir) yüklü olduğundan emin olun.
2.  Dosyaları derleyin:
    ```bash
    javac src/*.java
    ```
3.  Uygulamayı çalıştırın:
    ```bash
    java src/Main.java
    ```

## Örnek Kullanım

```text
Select Payment Method:
1: Google Pay
2: Apple Pay
3: Credit Card
4: PayPal
Enter choice (1-4): 4
Enter amount: 150
Paying 150 with PayPal.
```
