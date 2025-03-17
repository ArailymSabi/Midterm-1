package OnlinePayment;

public class CryptoPayment implements PaymentMethod {
    @Override
    public void processPayment(int amount) {
        System.out.println("Оплата криптовалютой на сумму " + amount + " успешно выполнена.");
    }
}