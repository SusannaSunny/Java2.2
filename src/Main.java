import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        int startBalance = 100;  // стартовый баланс
        int sumBoard = 1000;  // Граница бонусов
        int sumAdd = 1100;  //  Сумма пополнения
        int finBalance;   //  Итоговый баланс
        int sumBonus;  //  Количество бонусов

        // Условным оператором проверяете превысила ли
        // сумма пополнения порог и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
            // Проверка суммы пополнения относительно порога

        if (sumAdd > sumBoard) {
            finBalance = sumAdd / 100 + startBalance + sumAdd;
        } else {
            finBalance = startBalance + sumAdd;
        }
            // Проверка и расчет бонусов
        if (sumAdd < 1000) {
            sumBonus = 0;
        } else {
            sumBonus = sumAdd / 100;
        }
            // Вывод на экран
        System.out.println("Баланс: " + finBalance);
        System.out.println("Количество бонусов: " + sumBonus);
    }
}
