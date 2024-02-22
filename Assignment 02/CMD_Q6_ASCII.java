public class CMD_Q6_ASCII {

	public static void main(String[] args) {
		char ch=args[0].charAt(0);
		System.out.println("The character is " + ch);
		
		int a=ch;
		/*or we can write
		 * int a=ch;
		 * instead of
		 * int a=args[0].charAt(0);
		 */
		System.out.println("The ASCII value is " + a);
	}

}