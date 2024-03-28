import java.util.Scanner;
public class Q1_SumAndAverage {
    public static int add(int [] arr){
        int sum=0;
        int m= arr.length;
        for(int i=0; i<m; i++){
            sum= sum+ arr[i];
            System.out.print(arr[i] + " ");
        }
        return sum;
    }

    public static double avrg(double sum, double n){
        return sum/n;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n= sc.nextInt();
        int min= 1;
        int max= n;
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i]= (int)(Math.random()*(max-min+1)+ min);
        }
        double sum= add(arr);
        System.out.println("\nThe sum of the random numbers is " + sum);
        double avg= avrg(sum, n);
        System.out.println("The average of the random numbers is " + avg);
        sc.close();
    }
}