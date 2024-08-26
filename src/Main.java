public class Main {
    public static void main(String[] args) {
        int initialBalance = 300;  // измененная начальная сумма
        int refillAmount = 1600;   // измененная сумма пополнения

        int bonus = 0;
        if (refillAmount > 1000) {
            bonus = refillAmount / 100;  // расчет бонусов
        }

        int finalBalance = initialBalance + refillAmount + bonus;  // итоговый счет

        System.out.println("Итоговый счет: " + finalBalance);
        System.out.println("Количество бонусных рублей: " + bonus);
    }
}
