import java.util.Scanner;
public class HW_Q3_Months {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month number");
        int num= sc.nextInt();

        String month= "";

        switch(num){
            case 1 -> month = "January";
            case 2 -> month = "February";
            case 3 -> month = "March";
            case 4 -> month = "April";
            case 5 -> month = "May";
            case 6 -> month = "June";
            case 7 -> month = "July";
            case 8 -> month = "August";
            case 9 -> month = "September";
            case 10 -> month = "October";
            case 11 -> month = "November";
            case 12 -> month = "December";
        }
        System.out.println("The month is " + month);
        sc.close();
    }
}
