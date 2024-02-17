import java.util.Scanner;
public class Q08_NumGuesser {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int max=10, min=1, a, random;
		do {
			random = (int)(Math.random()*(max-min+1)+min);
			System.out.println("User guesses: ");
			a=sc.nextInt();
			System.out.println("Computer guesses: " + random);
			
			if(a>random) {
				System.out.println("Too high, try again");
			}
			else if(a<random) {
				System.out.println("Too low, try again");
			}
			else if(a==random) {
				System.out.println("Good guess");
				break;
			}
		}while(a != random);
		sc.close();
	}
}