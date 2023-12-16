import java.util.Scanner;
public class Q5_LeapYear {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the year");
        int year=sc.nextInt();

        if(year%4==0){
            if(year%100!=0){
                System.out.println("It is a leap year");
            }
            else if(year%400==0){
                System.out.println("It isa leap year");
            }
            else{
                System.out.println("Not a leap year");
            }
            sc.close();
        }
    }
}
