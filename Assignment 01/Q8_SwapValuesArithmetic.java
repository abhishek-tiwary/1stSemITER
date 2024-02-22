public class Q8_SwapValuesArithmetic {

	public static void main(String[] args) {
		//Declaring variable
		int x= 10;
		int y = 11;
		System.out.println("x = " + x + " y = " +y);
		//Swapping process
		 x=x+y;
		 y=x-y;
		 x=x-y;
		 /*Can also do it by using multiplication and division
		  * x= x*y;
		  * y=x/y;
		  * x=x/y; */
		System.out.println("x = " + x + " y = " + y);
	}

}