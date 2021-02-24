import java.util.Scanner;

public class data2 {
    public static void main(String[] args) {
        Scanner strin = new Scanner(System.in);
        System.out.println("Введите I like Java!!!");
        String str = strin.nextLine();
        if (str.contains("Java") && str.startsWith("I like") && str.endsWith("!!!")) {
            System.out.println( str.toUpperCase());
            String res = str.replace('a',  'o');
            System.out.println( res.substring(7, 11));
        }
        else {
            System.out.println("Вы ошиблись при вводе");
        }
    }
}
