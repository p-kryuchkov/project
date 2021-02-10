import java.util.Scanner;

public class operator3 {
    public static void main(String[] args) {
        Scanner cc = new Scanner(System.in);
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int x = cc.nextInt();
        if (x == 1) {
            double kg = 1;
            double funt = 2.20462 * kg;
            double unc = 35.27391 * kg;
            double ston = 0.15747 * kg;
            Scanner ms = new Scanner(System.in);
            System.out.println("Выберите единицу измерения: 1 - килограмм, 2 - фунт, 3 - унция, 4 - стон");
            int y = ms.nextInt();
            Scanner mn = new Scanner(System.in);
            System.out.println("Введите число: ");
            double a = mn.nextDouble();
            switch (y) {
                case 1:
                    System.out.println("Килограмм: " + (a));
                    System.out.println("Фунтов: " + (a * funt));
                    System.out.println("Унций: " + (a * unc));
                    System.out.println("Стонов: " + (a * ston));
                    break;
                case 2:
                    System.out.println("Килограмм: " + (a * (kg/funt)));
                    System.out.println("Фунтов: " + (a));
                    System.out.println("Унций: " + (a * (unc/funt)));
                    System.out.println("Стонов: " + (a * (ston/funt)));
                    break;
                case 3:
                    System.out.println("Килограмм: " + (a * (kg/unc)));
                    System.out.println("Фунтов: " + (a * (funt/unc)));
                    System.out.println("Унций: " + (a));
                    System.out.println("Стонов: " + (a * (ston/unc)));
                    break;
                case 4:
                    System.out.println("Килограмм: " + (a * (kg/ston)));
                    System.out.println("Фунтов: " + (a * (funt/ston)));
                    System.out.println("Унций: " + (a * (unc/ston)));
                    System.out.println("Стонов: " + (a));
                    break;
                default:
                    System.out.println("Вы ввели неверное значение при выборе единиц измерения");
                    break;

            }

        }
        else if (x == 2) {
            double m = 1;
            double mile = 0.00062 * m;
            double jard = 1.09361 * m;
            double foot = 3.28084 * m;
            Scanner ds = new Scanner(System.in);
            System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
            int z = ds.nextInt();
            Scanner dn = new Scanner(System.in);
            System.out.println("Введите число: ");
            double a = dn.nextDouble();
            switch (z) {
                case 1:
                    System.out.println("Метры: " + (a));
                    System.out.println("Мили: " + (a * mile));
                    System.out.println("Ярды: " + (a * jard));
                    System.out.println("Футы: " + (a * foot));
                    break;
                case 2:
                    System.out.println("Метры: " + (a * (m / mile)));
                    System.out.println("Мили: " + (a));
                    System.out.println("Ярды: " + (a * (jard / mile)));
                    System.out.println("Футы: " + (a * (foot / mile)));
                    break;
                case 3:
                    System.out.println("Метры: " + (a * (m / jard)));
                    System.out.println("Мили: " + (a * (mile / jard)));
                    System.out.println("Ярды: " + (a));
                    System.out.println("Футы: " + (a * (foot / jard)));
                    break;
                case 4:
                    System.out.println("Метры: " + (a * (m / foot)));
                    System.out.println("Мили: " + (a * (mile / foot)));
                    System.out.println("Ярды: " + (a * (jard / foot)));
                    System.out.println("Футы: " + (a));
                    break;
                default:
                    System.out.println("Вы ввели неверное значение при выборе единиц измерения");
                    break;


            }

        }
        else {
            System.out.println("Вы ввели неверное значение при выборе того что будем переводить");
        }
    }
}