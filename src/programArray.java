public class programArray {
    public static void main(String[] args) {
        int[] myArray = {11, 23, 31, 44, 58,};
        int a = myArray[0];
        int b = myArray[myArray.length - 1];
        System.out.println(myArray[0] +" " + myArray[myArray.length - 1]);
         myArray[0] = b;
         myArray[myArray.length - 1] = a;
        System.out.println(myArray[0] +" " + myArray[myArray.length - 1]);
        int c = (myArray.length - 1) / 2 ; 
        System.out.println(myArray[0] + myArray[c]);

    }
}
