import java.util.Scanner;
public class Q04_Factorial {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number");
        int a= sc.nextInt();
        System.out.println("Enter the second number");
        int b= sc.nextInt();
        
        if(b>a && a>0 && b>0){
        for(int i= a; i<=b; i++){
            int factorial= 1;

            for(int j=2; j<=i; j++){
                factorial*=j;
            }
            System.out.println("The factorial of " + i + " is " + factorial);
        }
        }
        else{
            System.out.println("Invalid inputs. First number should always be lesser than the second number");
        }
        sc.close();
    }
}
