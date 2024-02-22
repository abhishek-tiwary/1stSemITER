import java.util.Scanner;

public class Q4_SumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number between 0 and 1000: ");
		int num= sc.nextInt();
		int sum= 0;
		
		int d1= num%10;
		sum = sum+d1;
		
		num= num/10;
		int d2= num%10;
		sum+= d2;
		
		num=num/10;
		sum+= num;
		
		System.out.println("The sum of the digits is " + sum);

        sc.close();
		

	}

}
