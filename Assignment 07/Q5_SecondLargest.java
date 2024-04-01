import java.util.Scanner;

public class Q5_SecondLargest {
    public static int secLarge(int[] arr){
        int largest= Integer.MIN_VALUE;
        int secondLargest= Integer.MIN_VALUE;
        int n= arr.length;
        for(int i=0; i<n; i++){
            if(arr[i]>largest){
                secondLargest= largest;
                largest= arr[i];
            }
            else if(arr[i]>secondLargest){
                secondLargest= arr[i];
            }
        }
        return secondLargest;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n= sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("The second largest element of the array is " + secLarge(arr));
        sc.close();
    }
}
