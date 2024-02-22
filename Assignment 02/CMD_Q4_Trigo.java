public class CMD_Q4_Trigo {

	public static void main(String[] args) {
		double t= Double.parseDouble(args[0]);
		double rad= Math.toRadians(t);
		double result= Math.cos(5*rad)+ Math.sin(7*rad);
		System.out.println("The sum of cos(5t) and sin(7t) is "+ result);
	}
}