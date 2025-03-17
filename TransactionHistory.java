package OnlinePayment;

import java.util.ArrayList;
import java.util.List;

public class TransactionHistory {
    private List<Transaction> transactions = new ArrayList<>();

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public void printHistory() {
        System.out.println("История транзакций:");
        for (Transaction t : transactions) {
            System.out.println(t);
        }
    }
}
