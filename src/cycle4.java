import java.util.Scanner;
import java.util.Arrays;
public class cycle4 {
    public static void main(String[] args) {
        Scanner arrv = new Scanner(System.in);
        System.out.println("Введите размер матрицы по вертикали");
        int v = arrv.nextInt();
        Scanner arrh = new Scanner(System.in);
        System.out.println("Введите размер матрицы по горизонтали");
        int h = arrh.nextInt();
        int[][] array = new int[v][h];
        for (int i = 0; i < v; i++ ) {
            for (int k = 0; k < h; k++ ) {
                Scanner numin = new Scanner(System.in);
                System.out.println("Введите число");
                int num = numin.nextInt();
                array[i][k] = num;
            }
        }
        for (int i = 0; i < 1 ; i++ ){
            for (int k = 0; k < h;  k++) {
                System.out.print((3*array[i][k]) + " ");
            }
        }
    }
}
