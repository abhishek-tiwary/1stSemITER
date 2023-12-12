import java.util.Scanner;
public class Q1_CastVote {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = sc.nextInt();
    
        if (age>= 18) {
            System.out.println("You are eligible to cast your vote");
        }
        sc.close();
}
}
