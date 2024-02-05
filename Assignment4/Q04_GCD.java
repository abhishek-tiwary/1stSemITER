import java.util.Scanner;
public class Q04_GCD {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number");
        int a= sc.nextInt();
        System.out.println("Enter the second number");
        int b= sc.nextInt();
        int x= a, y=b;
        int temp;

        while(b!=0){
            temp=b;
            b=a%b;
            a=temp;
        }
        System.out.println("The gcd of " + x + " and " + y + " is " + a);
        sc.close();
    }
}
