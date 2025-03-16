package OnlinePaymentGateway;

public class PaymentFactory {
    public static PaymentMethod getPaymentMethod(String type) {
        switch (type.toLowerCase()) {
            case "creditcard":
                return new CreditCard();
            case "paypal":
                return new PayPal();
            case "crypto":
                return new Crypto();
            case "external":
                return new ExternalPaymentAdapter(new ExternalPaymentService());
            default:
                throw new IllegalArgumentException("Неизвестный способ оплаты: " + type);
        }
    }
}