import java.util.Scanner;
public class Q3_InputOccurence {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Enter 10 numbers into the array");
        for(int i=0; i<10; i++){
            arr[i]= sc.nextInt();
        }

        System.out.println("Enter number to be searched");
        int n= sc.nextInt();
        int counter=0;
        for(int i=0; i<10; i++){
            if(arr[i]==n){
                counter++;
            }
        }
        System.out.println(n + " is present " + counter + " time" + ((counter > 1) ? "s" : ""));
        sc.close();
    }
}
