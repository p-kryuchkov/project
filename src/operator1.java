import java.util.Scanner;
public class operator1 {
    public static void main(String[] args) {
        Scanner xin = new Scanner(System.in);
        System.out.println("Введите X: ");
        int x = xin.nextInt();
        Scanner yin = new Scanner(System.in);
        System.out.println("Введите Y: ");
        int y = yin.nextInt();
        Scanner zin = new Scanner(System.in);
        System.out.println("Введите Z: ");
        int z = zin.nextInt();
        int a = (x + y + z)/3;
        System.out.println("Среднее арифметическое чисел X, Y, Z: " + a);
        System.out.println("Среднее арифметическое чисел, деленное на 2: " + a / 2);
        if (a/2>3) {
            System.out.println("Программа выполнена корректно");
        }

    }
}
