public class Main {
    public static void main(String[] args) {

        // Объявляем переменные для входных данных.

        double account = 500; // Начальная сумма на счёте.
        double amount = 900; // Сумма пополнения счёта.

        // Вычисляем количество бонусов и итоговую сумму на счёте с учетом бонусов.

        if (amount > 1000) {
            int bonus = (int) (amount / 100); // Количество бонусов.
            int result = (int) (account + amount + bonus); // Итоговая сумма на счёте.
            System.out.println("Бонусов начислено: " + bonus); // Выводим количество бонусов.
            System.out.println("Сумма на счёте: " + result); // Выводим итоговую сумму на счёте с учетом бонусов.
        } else {
            int bonus = (int) (0);
            int result = (int) (account + amount + bonus);
            System.out.println("Бонусов не начислено");
            System.out.println("Сумма на счёте: " + result);
        }
    }
}