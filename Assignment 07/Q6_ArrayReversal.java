import java.util.Scanner;
public class Q6_ArrayReversal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n= sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        int i=0;
        int j=n-1;
        while(i<j){
            int temp= arr[i];
            arr[i]=arr[j];
            arr[j]= temp;
            i++;
            j--;
        }
        System.out.print("The reversed array is ");
        for(int k= 0; k<n; k++){
            System.out.print(arr[k] + " ");
        }
        sc.close();
    }
}
