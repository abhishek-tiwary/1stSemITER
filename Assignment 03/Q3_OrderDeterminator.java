import java.util.Scanner;
public class Q3_OrderDeterminator {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the three numbers");
        int x= sc.nextInt();
        int y= sc.nextInt();
        int z= sc.nextInt();


        if(x>y&&y>z){
            System.out.println("Decreasing");
        }
        else if(x<y&&y<z){
            System.out.println("Increasing");
        }
        else{
            System.out.println("Neither increasing nor decreasing");
        }
        sc.close();
    }
}
