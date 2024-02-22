import java.util.Scanner;
public class HW_Q05_NumPattern {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int row= sc.nextInt();
        String j= "1";
        System.out.println(j);
        for(int i=2; i<= row; i++){
            j= j+i+j;
            System.out.println(j);
        }
        sc.close();
    }
}
