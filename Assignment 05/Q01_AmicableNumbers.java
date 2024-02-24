import java.util.Scanner;
public class Q01_AmicableNumbers {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number");
        int a= sc.nextInt();
        System.out.println("Enter the second number");
        int b= sc.nextInt();
        int sum1= 0, sum2= 0;

        for(int i=1; i<=a/2; i++){
            if(a%i==0){
                sum1= sum1+i;
            }
        }
        for(int i=1; i<=b/2; i++){
            if(b%i==0){
                sum2= sum2+i;
            }
        }
        if(sum1==b && sum2==a){
            System.out.println("They are amicable numbers");
        }
        else{
            System.out.println("They are not amicable numbers");
        }
        sc.close();
    }
}
