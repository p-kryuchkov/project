import java.util.Scanner;

public class cycle3 {
    public static void main(String[] args) {
        Scanner arrin = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int n = arrin.nextInt();
        double[] array = new double[n];
        for (int i = 0; i < n; i++ ) {
            Scanner numin = new Scanner(System.in);
            System.out.println("Введите число");
            double num = numin.nextDouble();
            array[i] = num;
        }
        double sum = 0.0;
        for (int i = 0; i < n; i++ ) {
            sum += array[i];
        }
        double avr = sum/n;
        for (int i = 0; i < n; i++ ) {
            System.out.println("Элемент * среднее арифметическое = " + avr * array[i]);
        }
    }
}
