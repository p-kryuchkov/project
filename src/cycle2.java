import java.util.Scanner;

public class cycle2 {
    public static void main(String[] args) {
        Scanner numin = new Scanner(System.in);
        System.out.println("Введите число");
        int n = numin.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if( i % 2 != 0){
                sum = sum + i;
            }
        }
        System.out.println("Сумма нечетных чисел = " + sum);
    }
}
