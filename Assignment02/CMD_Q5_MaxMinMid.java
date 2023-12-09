public class CMD_Q5_MaxMinMid {

	public static void main(String[] args) {
		int a= Integer.parseInt(args[0]);
		int b= Integer.parseInt(args[1]);
		int c= Integer.parseInt(args[2]);
		
		//finding maximum
		int max1= Math.max(a, b);
		int max= Math.max(max1, c);
		
		//finding minimum
		int min1= Math.min(a, b);
		int min= Math.min(min1, c);
		
		//finding mid value
		int mid= a+b+c-max-min;
		
		System.out.println("The values in ascending order are " + min + "," + mid + "," + max);
	}

}
