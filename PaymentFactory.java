package OnlinePayment;

public class PaymentFactory {
    public static PaymentMethod getPaymentMethod(String type) {
        switch (type.toLowerCase()) {
            case "creditcard":
                return new CreditCardPayment();
            case "paypal":
                return new PayPalPayment();
            case "crypto":
                return new CryptoPayment();
            case "external":
                return new ExternalPaymentAdapter(new ExternalPaymentService());
            default:
                throw new IllegalArgumentException("Неизвестный способ оплаты: " + type);
        }
    }
}
