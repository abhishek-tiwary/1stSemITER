import java.util.Scanner;
public class Q03_PrimesBWNos {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number");
        int a= sc.nextInt();
        System.out.println("Enter the second number");
        int b= sc.nextInt();

        for(int i= a; i<=b; i++){
            int counter= 0;
            for(int j= 2; j<=i/2; j++){
                if(i%j==0){
                    counter+=1;
                    break;
                }
            }
            if(counter==0){
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
