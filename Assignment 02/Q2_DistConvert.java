import java.util.Scanner;

public class Q2_DistConvert {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the distance betwwen city A and city B in kilometres");
        double km= sc.nextDouble();

        double metre= 1000*km;
        System.out.println(km + "km is " + metre + " metres");

        double feet= 3280.8399*km;
        System.out.println(km + "km is " + feet + " feet");

        double inch= 39370.0787*km;
        System.out.printf("Rounded off distance between two cities in inches is %.2f\n", inch);

        double cm= 100000*km;
        System.out.println(km + "km is " + cm + " cm");

        long centim = (long) (100000*km);
		System.out.println("Distance between two cities in centimetres is " + centim + " centimetres");

		//typecasted double to long in centim because otherwise value was coming in exponential
		//%.2f means the value gets rounded off to two decimal places

        sc.close();
         
    }
    
}
