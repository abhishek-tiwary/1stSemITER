import java.util.Scanner;
public class Q8_CartesianPlane {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the x co-ordinate");
        int x= sc.nextInt();
        System.out.println("Enter the y co-ordinate");
        int y= sc.nextInt();

        if(x>0 && y>0){
            System.out.println("The point is in 1st Quadrant");
        }
        else if(x<0 && y>0){
            System.out.println("The point is in 2nd Quadrant");
        }
        else if(x<0 && y<0){
            System.out.println("The point is in the 3rd Quadrant");
        }
        else if(x>0 && y<0){
            System.out.println("The point is in the 4th Quadrant");
        }
        sc.close();
    }
}
