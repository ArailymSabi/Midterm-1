package OnlinePayment;

public class CreditCardPayment implements PaymentMethod {
    @Override
    public void processPayment(int amount) {
        System.out.println("Оплата кредитной картой на сумму " + amount + " успешно выполнена.");
    }
}
