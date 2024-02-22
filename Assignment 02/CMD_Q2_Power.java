public class CMD_Q2_Power{

	public static void main(String[] args){
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		System.out.println("a= "+ a+ " b= " +b);
		double result= Math.pow(b,a);
		System.out.println("result= "+result);
		}
}	
