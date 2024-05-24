import java.util.Scanner;
public class HW_Q2_FruitCut {
    public static int steps(int[] arr, int n){
        int count=0;
        for(int i=0; i<n; i++){
            count++;
            for(int j= i+1; j<n; j++){
                if(arr[j]==arr[i]){
                    count--;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of fruits");
        int n= sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter the weight of the " + n + " fruits");
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("The number of step is " + steps(arr, n));
        sc.close();

    }
}
