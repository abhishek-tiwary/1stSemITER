//Step1- Import the Scanner class
import java.util.Scanner;

public class Q1_TempConvert{
    public static void main(String args[]){

        //Step 2- Create Scanner class object
        Scanner sc=new Scanner(System.in);

        //Step 3- Enter the value in the required format
        System.out.println("Enter the temperature in Fahrenheit");
        double farhn=sc.nextDouble();

        double cels= (farhn-32)*(5.0/9);
        System.out.println("The temperature in Celsius is" + cels);

        sc.close();
    }
}

/* To accept int/long/short/float value:
 * int/long/short/float a=sc.nextInt/sc.nextLong/sc.nextShort/sc.nextFloat
 * 
 * To accept String value:
 * String a = sc.next() or sc.nextLine() */

/* METHOD 2- USING COMMAND LINE ARGUMENTS
 * double farhn, cels;
 * farhn=Double.parseDouble(args[0]);
 * cels=(farhn-32)*(5.0/9);
 * System.out.println("Temp in Ceclsius:" + cels);
 * 
 * Now, in terminal:
 * Step 1- javac TempConvert.java
 * Step 2- java TempConvert <input value for farhn here itself as it is a command line prompt */

