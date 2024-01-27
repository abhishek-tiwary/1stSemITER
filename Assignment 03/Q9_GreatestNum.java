import java.util.Scanner;
public class Q9_GreatestNum {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number");
        int a= sc.nextInt();
        System.out.println("Enter the second number");
        int b= sc.nextInt();
        System.out.println("Enter the third number");
        int c= sc.nextInt();

        int max1= Math.max(a, b);
		int max= Math.max(max1, c);
        System.out.println(max + " is the greatest");

        if(a>b && a<c){
            System.out.println(a + " is second greatest");
        }
        else if(b>a && b<c){
            System.out.println(b + " is second greatest");
        }
        else{
            System.out.println(c + " is the second greatest");
        }
        sc.close();
    }
}
