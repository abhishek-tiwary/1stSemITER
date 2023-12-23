import java.util.Scanner;
public class Home_Q2_EggsCount {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the number of eggs");
        int eggs=sc.nextInt();

        int gross= eggs/144;
        eggs= eggs%144;
        int dozen= eggs/12;
        eggs= eggs%12;

        System.out.println("Your number of eggs is "+ gross + " gross, " + dozen + " dozen, and " + eggs);
        sc.close();
    }

}
