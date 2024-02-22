import java.util.Scanner;

public class Q7_PowerTable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//Ctrl+Shift+O automatically adds the first import line
		
		System.out.println("Enter the two numbers"); //type sys and then Ctrl+Space to select the sysout
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("a\tb\tpow(a,b)");
		System.out.println(a+ "\t" +b + "\t" +(int)Math.pow(a, b));
		a +=1;
		b +=1;
		System.out.println(a+ "\t" +b + "\t" +(int)Math.pow(a, b));
		a +=1;
		b +=1;
		System.out.println(a+ "\t" +b + "\t" +(int)Math.pow(a, b));
		a +=1;
		b +=1;
		System.out.println(a+ "\t" +b + "\t" +(int)Math.pow(a, b));
		a +=1;
		b +=1;
		System.out.println(a+ "\t" +b + "\t" +(int)Math.pow(a, b));
		
		sc.close();			

	}

}