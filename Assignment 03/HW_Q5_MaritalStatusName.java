import java.util.Scanner;
public class HW_Q5_MaritalStatusName {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("What is your gender (M or F)");
        char gender = sc.next().charAt(0);
        System.out.println("Enter first name: ");
        String Fname = sc.next();
        System.out.println("Enter last name: ");
        String Lname = sc.next();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        if(gender == 'F' && age>= 20){
            System.out.println("Are you married, " + Fname + " (y or n) ?");
            char marital = sc.next().charAt(0);
            if(marital == 'y'){
                System.out.println("Then I shall call you Mrs. " + Fname + " " + Lname);
            }
            else if(marital == 'n'){
                System.out.println("Then I shall call you Ms. " + Fname + " " + Lname);
            }
        }
        else if(gender == 'F' && age< 20){
            System.out.println("I shall call you " + Fname + " " + Lname);
        }

        if(gender == 'M' && age >=20){
            System.out.println("I shall call you Mr. " + Fname + " " + Lname);
        }
        else if(gender == 'M' && age<20){
            System.out.println("I shall call you " + Fname + " " + Lname);
        }
        sc.close();
    }
}
