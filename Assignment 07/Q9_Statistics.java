import java.util.Scanner;
public class Q9_Statistics {
    public static double deviation(double[] x){
        double mean= mean(x);
        double deviation=0;
        double sumOfSq=0;
        for(int i=0; i<10; i++){
            sumOfSq+= Math.pow((x[i]-mean), 2);
        }
        deviation= Math.sqrt(sumOfSq/9);
        return deviation;
    }

    public static double mean(double[] x){
        double mean= 0;
        double sum=0;
        for(int i=0; i<10; i++){
            sum= sum+x[i];
        }
        mean= sum/10;
        return mean;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double arr[]= new double[10];
        System.out.println("Enter the 10 elements of the array");
        for(int i=0; i<10; i++){
            arr[i]= sc.nextDouble();
        }
        System.out.println("The mean of the values is " + mean(arr));
        System.out.println("The standard deviation is " + deviation(arr));
        sc.close();
    }
}
