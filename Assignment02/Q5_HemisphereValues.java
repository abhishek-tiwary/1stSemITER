import java.util.Scanner;
public class Q5_HemisphereValues {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

        System.out.println("Enter the radius of the hemisphere: ");
        double rad= sc.nextDouble();

		double surfArea= 3*3.14*rad*rad;
        System.out.println("The surface area of the hemisphere is " + surfArea);

		double volume= (2.0/3)*3.14*rad*rad*rad;
        System.out.println("The volume of the hemisphere is " + volume);

		sc.close();
	}
}
