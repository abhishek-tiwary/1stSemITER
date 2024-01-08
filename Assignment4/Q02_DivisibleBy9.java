import java.util.Scanner;
public class Q02_DivisibleBy9 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int sum=0;
		
		while(n>0)
		{
			int d=n%10;
			sum=sum+d;
			n=n/10;
		}
		System.out.println("The sum is " + sum);
		if(sum%9==0)
		{
			System.out.println("The number is divisble by 9");
		}
		else {
			System.out.println("The number is not divisble by 9");
		}
        sc.close();

	}

}