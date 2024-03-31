import java.util.Scanner;

public class Q4_MinArray {
    public static double min(double[] array){
        double min= array[0];
        for(int i=1; i<array.length; i++){
            if(min>array[i]){
                min= array[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] arr = new double[10];

        System.out.print("Enter ten numbers: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextDouble();
        }

        System.out.println("The minimum number is: " + min(arr));
        sc.close();
    }
}
