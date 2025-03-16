package OnlinePaymentGateway;

public class Transaction {
    private String method;
    private int amount;
    private String status;

    public Transaction(String method, int amount, String status) {
        this.method = method;
        this.amount = amount;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Транзакция [Метод: " + method + ", Сумма: " + amount + ", Статус: " + status + "]";
    }
}