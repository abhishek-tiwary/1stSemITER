public class Q9_CheckOutput {

	public static void main(String[] args) {
		System.out.println(5);
		// 5 is printed as it is
		System.out.println((float) 25/6);
		/* Only 25/6 would give us 4 as both 25 and 6 are integer values
		 * 25.0/6.0 or 25.0/6 or 25/6.0 both, one or two values would be in double point, hence answer will also be in double point = 4.16666666666667
		 * sout((float) 25/6 will give 4.1666665
		 * This is called type casting, where compiler prefers higher order data type (double) than lower order ones (float) until you mention you want it in lower order data type
		 * sout((float)(25/6)) gives 4.0 as 25/6 is 4 and 4 in float type is 4.0
		 * sout((float)(25.0/6)) gives 4.1666665 as the float shortens the double data type 
		 */
		System.out.println(5+'6');
		/* We get 59 as the output
		 * '6' refers to the ASCII value of 6, which is 54
		 * Hence 5+'6' = 5 + 54= 59
		 * sout((int)'6'); also gives you 54
		 * sout(5+"6") gives you 56 as under double quotes, 6's value is kept as it is and not its ASCII value
		 * sout('5'+"6") gives you 56. The ASCII value of 5 is not taken as 6 is present as a string so the + acts as concatenation and not as + operator
		 * sout(5+"6"+1) gives you 561
		 * sout(5+'6'+1) gives you 60
		 */
		System.out.println(5+7+'9');
		/*Output comes out to be 69 as '9'= ASCII value of 9= 57
		 * Hence 5+7+'9' = 12+57 = 69
		 */
		System.out.println("92"+7+5);
		/*Output comes out to be 9275
		 * Anything concatenated with a string (here "92" is a string), is a string
		 */
		System.out.println(2+"9");
		//Output comes out to be 29 due to concatenation of strings
		System.out.println(011 + 1.94 + "c" + "s");
		//Output comes out to be 10.94cs. 011 is converted to binary to get 9. 
	}
}
