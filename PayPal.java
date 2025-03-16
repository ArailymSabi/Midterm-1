package OnlinePaymentGateway;

public class PayPal implements PaymentMethod {
    @Override
    public void processPayment(int amount) {
        System.out.println("Оплата через PayPal на сумму " + amount + " успешно выполнена.");
    }
}
