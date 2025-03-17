package OnlinePayment;

public class PayPalPayment implements PaymentMethod {
    @Override
    public void processPayment(int amount) {
        System.out.println("Оплата через PayPal на сумму " + amount + " успешно выполнена.");
    }
}