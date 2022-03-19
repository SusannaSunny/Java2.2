import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        int startBalance = 100;
        int sumBoard = 1000;
        int sumAdd = 1100;
        int finBalance;
        int sumBonus;

        // Условным оператором проверяете превысила ли
        // сумма пополнения порог и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.

        if (sumAdd > sumBoard) {
            finBalance = sumAdd / 100 + startBalance + sumAdd;
        } else {
            finBalance = startBalance + sumAdd;
        }

        if (sumAdd < 1000) {
            sumBonus = 0;
        } else {
            sumBonus = sumAdd / 100;
        }

        System.out.println("Баланс: " + finBalance);
        System.out.println("Количество бонусов: " + sumBonus);
    }
}
