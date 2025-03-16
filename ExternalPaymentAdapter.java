package OnlinePaymentGateway;

public class ExternalPaymentAdapter implements PaymentMethod {
    private ExternalPaymentService externalService;

    public ExternalPaymentAdapter(ExternalPaymentService externalService) {
        this.externalService = externalService;
    }

    @Override
    public void processPayment(int amount) {
        externalService.makePayment(amount);
        System.out.println("Оплата через внешний сервис на сумму " + amount + " успешно выполнена.");
    }
}
