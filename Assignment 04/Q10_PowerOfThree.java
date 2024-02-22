import java.util.Scanner;
public class Q10_PowerOfThree {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int num= sc.nextInt();
		int product=1;
		while(product*3<=num) {
			product=product*3;
		}
		System.out.println("The highest power of 3 less than or equal to " + num + " is " + product);
		sc.close();
	}

}