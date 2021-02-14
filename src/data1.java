import java.util.Scanner;

public class data1 {
    public static void main(String[] args) {
        Scanner numin1 = new Scanner(System.in);
        System.out.println("Введите 1 число");
        String n1 = numin1.nextLine();
        Scanner numin2 = new Scanner(System.in);
        System.out.println("Введите 2 число");
        int n2 = numin2.nextInt();
        Integer nn1 = new Integer(n1);
        Integer nn2 = n2;
        int result = nn1.compareTo(nn2);
        switch (result){
            case 1: System.out.println("Наибольшее число: " + nn1);
            double nn = nn2;
            System.out.println("Наименьшее число в double: " + nn);
            break;
            case 0: System.out.println("Числа равны");
            break;
            case -1: System.out.println("Наибольшее число: " + nn2);
            double nm = nn1;
            System.out.println("Наименьшее число в double: " + nm);
            break;

        }






    }
}
