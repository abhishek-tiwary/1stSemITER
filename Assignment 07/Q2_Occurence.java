import java.util.Scanner;
public class Q2_Occurence {
    public static String Occur(int[] arr){
        for(int i=1; i<=100; i++){
            if(arr[i]>0){
                System.out.println(i + " occurs " + arr[i] + " time" + ((arr[i]>1) ? "s": ""));
            }
        }
        return "";
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the integers between 1 and 100");
        int arr[]= new int[101];
        int n;
        while((n=sc.nextInt())!=0){
            if(n>=1 && n<=100) arr[n]++;
            else System.out.println("Integer not in range of 1 to 100");
        }
        System.out.println(Occur(arr));
        // for(int i=1; i<=100; i++){
        //     if(arr[i]>0){
        //         System.out.println(i + " occurs " + arr[i] + " time" + ((arr[i] > 1) ? "s" : ""));
        //     }
        // }
        sc.close();
    }
}
