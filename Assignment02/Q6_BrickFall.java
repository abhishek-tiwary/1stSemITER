import java.util.Scanner;
public class Q6_BrickFall{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the number of seconds");
        double time=sc.nextDouble();

        double d= (1.0/2)*32.174*time*time;

        System.out.println("The distance travelled is " + d + " feet");

        sc.close();
    }
}