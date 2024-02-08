import java.util.Scanner;
public class Q06_Power {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the base: ");
		int base=sc.nextInt();
		System.out.println("Enter the power: ");
		int power=sc.nextInt();
		int prod= 1;
		for(int i=1; i<=power; i++) {
			prod= prod*base;
		}
		System.out.println(base + " to the power " + power + " is " + prod);
		sc.close();
	}

}