import java.util.Scanner;
public class HW_Q5_Consecutive {
    public static boolean ConsecutiveNum(int a, int b, int c){
        if((a+1==b && b+1==c) || (a-1==b && b-1==c)){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the three numbers");
        int x= sc.nextInt();
        int y= sc.nextInt();
        int z= sc.nextInt();
        System.out.println("Are the numbers consecutive? " + ConsecutiveNum(x, y, z));
        sc.close();
    }
}
