import java.util.Scanner;
public class Q4_NumberGuesser {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int min=1;
        int max=9;

        int num= (int)((Math.random()*(max-min+1))+1);

        System.out.println("Enter user number");
        int n1=sc.nextInt();
		
        if(n1==num){
            System.out.println("Computer guess is " + num);
            System.out.println("You got it right");
        }
        else if(n1==num+1 || n1==num-1){
            System.out.println("Computer guess is " + num);
            System.out.println("Almost got it");
        }
        else{
            System.out.println("Computer guess is " + num);
            System.out.println("You got it wrong");
        }
        sc.close();

    }
}
