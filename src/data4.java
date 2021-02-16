import java.util.Random;

public class data4 {
    public static void main(String[] args) {
     int myarray[]= new int[15];
     for (int i=0; i<myarray.length; i++) {
        Random random = new Random();
        int x = random.nextInt(41);
        myarray[i] = x - 20;
     }
     int max = myarray[0];
     for (int i=0; i<myarray.length; i++) {
         if (myarray[i] > max) max = myarray[i];
     }
        System.out.println("Наибольшее число в массиве: " + max);
        int min = myarray[0];
     for (int i=0; i < myarray.length; i++) {
        if (myarray[i] < min) min = myarray[i];
        }
        System.out.println("Наименьшее число в массиве: " + min);
     int absmax = Math.abs(max);
     int absmin = Math.abs(min);
     if (absmax > absmin) {
         System.out.println("Наибольшее число в массиве по модулю: " + absmax);
     }
     if (absmax < absmin) {
         System.out.println("Наибольшее число в массиве по модулю: " + absmin);
     }
    }

}
