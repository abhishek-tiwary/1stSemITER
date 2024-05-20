import java.util.Arrays;
import java.util.Scanner;

public class Q12_SelectionSort {
    public static void sort(int[] arr, int n){
        // One by one move boundary of unsorted sub array
        for (int i = 0; i < n-1; i++) {
            // Find the minimum element in unsorted array
            int minIdx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[minIdx]){
                    minIdx = j;
                }
            // Swap the found minimum element with the first element
                int temp = arr[minIdx];
                arr[minIdx] = arr[i];
                arr[i] = temp;
        }
        System.out.println("The sorted array is " + Arrays.toString(arr));
    }
        
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arr= new int[10];
        System.out.println("Enter 10 elements of your array");
        for(int i=0; i<10; i++){
            arr[i]= sc.nextInt();
        }
        sort(arr, 10);
        sc.close();
    }
}
