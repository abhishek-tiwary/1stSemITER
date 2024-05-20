import java.util.Arrays;
import java.util.Scanner;
public class Q11_BubbleSort {
    public static int[] sort(int [] list, int n){
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(list[i]>list[j]){
                    int temp= list[i];
                    list[i]= list[j];
                    list[j]= temp;
                }

            }
        }
        System.out.println("The sorted array is" + Arrays.toString(list));
        return list;
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of your array");
        int n= sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter " + n + " elements of your array");
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        sort(arr, n);
        sc.close();
    }
}
