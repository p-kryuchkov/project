import java.util.Scanner;

public class itog1 {
    public static void main(String[] args) {
        Scanner cd = new Scanner(System.in);
        System.out.println("Введите курс доллара: ");
        double c = cd.nextDouble();
        Scanner cr = new Scanner(System.in);
        System.out.println("Введите количество рублей: ");
        double r = cr.nextDouble();
        if (r > 0 & c > 0) {
            double result = Math.round((r / c) * 100);
            System.out.println("Итого: " + (result / 100) + " долларов");
        }
        else {
            System.out.println("Введите корректные данные");
        }
    }

}
