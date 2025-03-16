package OnlinePaymentGateway;

public class Crypto implements PaymentMethod {
    @Override
    public void processPayment(int amount) {
        System.out.println("Оплата криптовалютой на сумму " + amount + " успешно выполнена.");
    }
}
