import java.util.Scanner;
public class Q3_GrossSalary {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the basic salary of the employee");
		long BasicSal=sc.nextLong();
		
		float da= (float)0.4*BasicSal;
		System.out.println("The Dearness Allowance of the employee is " + da);
		
		float hra= (float)0.2*BasicSal;
		System.out.println("The House Rent Allowance of the employee is " + hra);
		
		System.out.println("The gross salary of the employee is "+ (int)(BasicSal+ da+ hra));
		
		sc.close();

	}

}