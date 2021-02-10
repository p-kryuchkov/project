import java.util.Scanner;

public class operator2 {
    public static void main(String[] args) {
        Scanner fn = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int x = fn.nextInt();
        Scanner sn = new Scanner(System.in);
        System.out.println("Введите второе число: ");
        int y = sn.nextInt();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите символ: ");
        String z = in.nextLine();
        switch (z) {
            case "+": System.out.println("x + y = " + (x + y));
                break;
            case "-": System.out.println("x - y = " + (x - y));
                break;
            case "*": System.out.println("x * y = " + (x * y));
                break;
            case "/": System.out.println("x / y = " + (x / y));
                break;
        }
    }
}
