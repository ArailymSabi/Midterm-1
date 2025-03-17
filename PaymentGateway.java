package OnlinePayment;

import java.util.Scanner;

public class PaymentGateway {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TransactionHistory transactionHistory = new TransactionHistory();

        while (true) {
            System.out.println("Выберите способ оплаты: creditcard, paypal, crypto, external");
            String paymentType = scanner.nextLine();

            System.out.println("Введите сумму платежа:");
            while (!scanner.hasNextInt()) {
                System.out.println("Ошибка! Введите сумму числом без точек:");
                scanner.next(); // Очищаем ввод
            }
            int amount = scanner.nextInt();
            scanner.nextLine(); // Очищаем перевод строки

            PaymentMethod paymentMethod;
            try {
                paymentMethod = PaymentFactory.getPaymentMethod(paymentType);
                paymentMethod.processPayment(amount);
                transactionHistory.addTransaction(new Transaction(paymentType, amount, "Успешно"));
            } catch (IllegalArgumentException e) {
                System.out.println("Ошибка: " + e.getMessage());
                transactionHistory.addTransaction(new Transaction(paymentType, amount, "Ошибка"));
            }

            System.out.println("Хотите продолжить? (yes/no)");
            String answer = scanner.nextLine();
            if (!answer.equalsIgnoreCase("yes")) {
                break;
            }
        }

        transactionHistory.printHistory();
        scanner.close();
    }
}
