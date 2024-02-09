import java.util.Scanner;
public class Q07_MultiplyTable {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number you want to find the multiplication table for: ");
		int num= sc.nextInt();
		int mul=1, i;
        sc.close();

		for(i=1; i<=10; i++) {
			mul= num*i;
			System.out.println(num + " X " + i + " = " + mul);
		}
	}
}
