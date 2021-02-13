import java.util.Scanner;

public class cycle1 {
    public static void main(String[] args) {
        int x = 7;
        int y = 8;
        int z = 11;
        Scanner arrin = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int n = arrin.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++ ) {
            Scanner numin = new Scanner(System.in);
            System.out.println("Введите число");
            int num = numin.nextInt();
            array[i] = num;
            if (array[i] == x) {
                System.out.println("Данное число имеется в константах");
            }
            if (array[i] == y) {
                System.out.println("Данное число имеется в константах");
            }
            if (array[i] == z) {
                System.out.println("Данное число имеется в константах");
            }

        }
    }
}
