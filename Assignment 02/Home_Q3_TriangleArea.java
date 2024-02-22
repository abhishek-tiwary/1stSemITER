import java.util.Scanner;
public class Home_Q3_TriangleArea {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter x1 co-ordinate");
        double x1= sc.nextDouble();
        System.out.println("Enter y1 co-ordinate");
        double y1= sc.nextDouble();

        System.out.println("Enter x2 co-ordinate");
        double x2= sc.nextDouble();
        System.out.println("Enter y2 co-ordinate");
        double y2= sc.nextDouble();
        
        System.out.println("Enter x3 co-ordinate");
        double x3= sc.nextDouble();
        System.out.println("Enter y3 co-ordinate");
        double y3= sc.nextDouble();

        double side1= Math.pow((Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2)), 0.5);
        double side2= Math.pow((Math.pow(x3-x2, 2) + Math.pow(y3-y2, 2)), 0.5);
        double side3= Math.pow((Math.pow(x1-x3, 2) + Math.pow(y1-y3, 2)), 0.5);

        double s= (side1+ side2+ side3)/2;

        double area= Math.pow(s*(s-side1)*(s-side2)*(s-side3), 0.5);
        System.out.println("Area of the triange is " + area);

        sc.close();

    }
}
