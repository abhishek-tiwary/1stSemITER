import java.util.Scanner;
public class Q5_Polygon {
    public static double area(int n, double side) {
        return (n * side * side) / (4  * Math.tan(Math.PI/n));
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of sides of the polygon");
        int n= sc.nextInt();
        System.out.println("Enter the length of each side");
        double side= sc.nextInt();
        System.out.println("The area of the polygon is " + area(n, side));
        sc.close();
    }
    
}