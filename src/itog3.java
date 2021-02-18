import java.util.Scanner;

public class itog3 {
    public static void main(String[] args) {
        Scanner strings = new Scanner(System.in);
        System.out.println("Введите количество строк");
        int a = strings.nextInt();
        if (a >0) {
            String stringarray[] = new String[a];
            int litarray[] = new int[a];
            int max = litarray[0];
            int x = 0;
            for (int i = 0; i < a; i++) {
                Scanner string = new Scanner(System.in);
                System.out.println("Введите строку");
                String b = string.nextLine();
                stringarray[i] = b;
                int count = 0;
                for (int j = b.length(); j > 0; j--) {
                    String c = String.valueOf(b.charAt(j - 1));
                    int cc = b.indexOf(c, j);
                    if (cc == - 1){
                        count += 1;
                    }
                }
                litarray[i] = count;
                if (litarray[i] > max) {
                    max = litarray[i];
                    x = i;
                }
            }
            System.out.println("Наибольшее количество символов в строке: " + stringarray[x]);
        }
        else {
            System.out.println("Количество строк должно быть больше ноля");
        }
    }
}
