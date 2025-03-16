package OnlinePaymentGateway;

public class ExternalPaymentService {
    public void makePayment(int amount) {
        System.out.println("Обработка платежа во внешней системе на сумму " + amount + "...");
    }
}
