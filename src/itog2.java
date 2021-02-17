import java.util.Scanner;

public class itog2 {
    public static void main(String[] args) {
        Scanner eq = new Scanner(System.in);
        System.out.println("Введите уравнение: ");
        String eqt = eq.nextLine();
        int e = eqt.indexOf('x');
        String sign = eqt.substring(1, 2);
        String signeqteqt = eqt.substring(3, 4);
        boolean pluseqt = sign.equals("+");
        boolean minuseqt = sign.equals("-");
        boolean signeqt = signeqteqt.equals("=");
        int lgth = eqt.length();
        if (lgth < 6) {
            if (pluseqt == false & minuseqt == false & signeqt == false) {
                System.out.println("Повторите ввод уравнения");
            } else {
                if (e == 4) {
                    String a = eqt.substring(0, 1);
                    String b = eqt.substring(2, 3);
                    if (a.matches("[0-9]+") & b.matches("[0-9]+")) {
                        if (pluseqt == true) {
                            int a1 = Integer.parseInt(a);
                            int b1 = Integer.parseInt(b);
                            System.out.println("x = " + (a1 + b1));
                        } else if (minuseqt == true) {
                            int a1 = Integer.parseInt(a);
                            int b1 = Integer.parseInt(b);
                            System.out.println("x = " + (a1 - b1));
                        }
                    } else {
                        System.out.println("Повторите ввод уравнения");
                    }
                }
                if (e == 2) {
                    String a = eqt.substring(0, 1);
                    String b = eqt.substring(4, 5);
                    if (a.matches("[0-9]+") & b.matches("[0-9]+")) {
                        if (pluseqt == true) {
                            int a1 = Integer.parseInt(a);
                            int b1 = Integer.parseInt(b);
                            System.out.println("x = " + (b1 - a1));
                        } else if (minuseqt == true) {
                            int a1 = Integer.parseInt(a);
                            int b1 = Integer.parseInt(b);
                            System.out.println("x = " + (a1 - b1));
                        }
                    } else {
                        System.out.println("Повторите ввод уравнения");
                    }
                }
                if (e == 0) {
                    String a = eqt.substring(2, 3);
                    String b = eqt.substring(4, 5);
                    if (a.matches("[0-9]+") & b.matches("[0-9]+")) {
                        if (pluseqt == true) {
                            int a1 = Integer.parseInt(a);
                            int b1 = Integer.parseInt(b);
                            System.out.println("x = " + (b1 - a1));
                        } else if (minuseqt == true) {
                            int a1 = Integer.parseInt(a);
                            int b1 = Integer.parseInt(b);
                            System.out.println("x = " + (a1 + b1));
                        }
                    } else {
                        System.out.println("Повторите ввод уравнения");
                    }
                }
                if (e != 0 & e != 2 & e != 4) {
                    System.out.println("Повторите ввод уравнения");

                }


            }
        } else {
            System.out.println("Повторите ввод уравнения");
        }
    }
}




