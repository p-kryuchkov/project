import java.util.Scanner;

public class data3 {
    public static void main(String[] args) {
        Scanner strin = new Scanner(System.in);
        System.out.println("Введите строку из слов, разделенных пробелами: ");
        String str = strin.nextLine();
        String[] result = str.split(" ");
        int j = 0;
        for (int i = 0; i < result.length; i++) {
            String x = result[i];
            if (x.matches("[a-zA-Z]+")) {
                System.out.println(x);
                j++;
            }
        }
        System.out.println("Слов состоящих только из латиницы: " + j);
    }
}
