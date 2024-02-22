import java.util.Scanner;
public class Q09_RemoveZero {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your number");
		int num= sc.nextInt();
		int t= num;
		int d, ans=0, index=0;
		while(num>0) {
			d=num%10;
			
			if(d !=0) {
				ans= ans+ d*(int)(Math.pow(10, index));
				index++;
			}
			num=num/10;
		}
		System.out.println("After removing 0 from " + t + ", the new number is " + ans);
		sc.close();
	}

}