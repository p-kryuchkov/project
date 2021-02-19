import java.util.Scanner;

public class itog4 {
    public static void main(String[] args) {
        System.out.println("Отгадайте загадку \"Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает\"");
        int i = 0;
        StringBuilder strBuild = new StringBuilder("Заархивированный вирус");
        StringBuilder strBuild1 = new StringBuilder("Подсказка");
        boolean pod;
        boolean res;
        do {
            Scanner result = new Scanner(System.in);
            System.out.println("Введите ответ");
            String b = result.nextLine();
            pod = b.equalsIgnoreCase("Подсказка");
            res = b.equalsIgnoreCase("Заархивированный вирус");
            if (pod == true & i == 0) {
                System.out.println("Что-то плохое, упаковано много раз");

                if (res == true) {
                    System.out.println("Правильно!");
                    break;
                }
                i = 1;
                continue;
            }
            if (pod == true & i != 0) {
                System.out.println("Подсказка уже недоступна");
                i++;
                continue;
            }
            if (res == true){
                System.out.println("Правильно!");
                break;
            }
            if (res == false & i == 2) {
                System.out.println("Обидно, приходи в другой раз");
            }
            else {
                System.out.println("Подумай еще!");
            }
            i++;
        }while (i < 3) ;


    }
}
