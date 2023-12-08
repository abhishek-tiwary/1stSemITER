public class CMD_Q3_RandomValueSum {

	public static void main(String[] args) {
		int max= Integer.parseInt(args[0]);
		int min= Integer.parseInt(args[1]);
		
		int d1= (int)((Math.random()*(max-min+1))+1);
		System.out.println("The first number is "+d1);
		
		int d2= (int)((Math.random()*(max-min+1))+1);
		System.out.println("The second number is "+d2);
		
		int sum= d1+d2;
		System.out.println("The sum of the two random numbers is " + sum);
	}

}