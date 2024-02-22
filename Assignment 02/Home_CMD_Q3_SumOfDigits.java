public class Home_CMD_Q3_SumOfDigits {
    public static void main(String[] args) {
        int num= Integer.parseInt(args[0]);
        int d1= num%10;
        num= num/10;
        int d2= num%10;
        num= num/10;
        int d3= num%10;
        num= num/10;
        int d4= num;

        int sum= d1+d4;
        System.out.println("The sum of the first and last digit is " + sum);
        System.out.println("The sum of the second and third digit is "+ (d2+d3));
    }
}
