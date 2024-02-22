import java.util.Scanner;
public class Q03_RandomNumbers {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n, i, randomNum;
		double avg;
		int sum=0;
		System.out.println("Enter your number");
		n=sc.nextInt();
		int min=1;
		int max=n;
		System.out.println("Random numbers generated are: ");
		i=1;
		do {
			randomNum=(int)(Math.random()*(max-min+1)+ min);
			System.out.print(randomNum+ " ");
			sum+=randomNum;
			i++;
		} while(i<=n);
		
		System.out.println("\nThe sum is " + sum);
		avg= (double)sum/n;
		System.out.println("\nThe average is " + avg);
		sc.close();
	}

}