import java.util.Scanner;

public class data2 {
    public static void main(String[] args) {
        Scanner strin = new Scanner(System.in);
        System.out.println("Введите I like Java!!!");
        String str = strin.nextLine();
        boolean x1 = str.contains("Java");
        boolean x2 = str.startsWith("I like");
        boolean x3 = str.endsWith("!!!");
        if (x1 == true & x2 == true & x3 == true) {
            System.out.println( str.toUpperCase());
            String res = str.replace('a',  'o');
            System.out.println( res.substring(7, 11));
        }
        else {
            System.out.println("Вы ошиблись при вводе");
        }
    }
}
