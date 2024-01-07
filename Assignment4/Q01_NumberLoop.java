import java.util.Scanner;
public class Q01_NumberLoop {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int a, b, c, i;
		int sum=0;
		System.out.println("Enter the first number");
		a=sc.nextInt();
		System.out.println("Enter the second number");
		b=sc.nextInt();
		System.out.println("Enter the third number");
		c=sc.nextInt();
        sc.close();
		
		for(i=a; i<=b; i=i+c)
		{
			System.out.print(i + " ");
            sum=sum+i;
		}
		System.out.println("\nThe sum of the numbers displayed is " + sum);
		
	}
}