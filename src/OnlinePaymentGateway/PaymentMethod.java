package OnlinePaymentGateway;

public interface PaymentMethod {
    void processPayment(int amount); // Обрабатывает платеж
}