import java.util.Scanner;
public class Home_Q1_TimeConversion {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of minutes");
        long minute=sc.nextLong();

        long minutesInAYear= 60*24*365;
        long year= minute/(minutesInAYear);
        long day=(minute/60/24)%365;
        
        System.out.println(minute+ " minutes is approximately "+ year +  " years and " + day + " days.");
        sc.close();

    }
}
