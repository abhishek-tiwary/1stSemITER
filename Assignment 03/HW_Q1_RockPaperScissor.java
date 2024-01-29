import java.util.Scanner;
public class HW_Q1_RockPaperScissor {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("scissor (0), rock (1), paper (2): ");
        int userGuess= sc.nextInt();
        int min= 0;
        int max= 2;
        int compGuess= (int)(Math.random()*(max-min+1)+min);
        String compChoice = "", userChoice= "";

        switch(compGuess){
            case 0 -> compChoice = "scissor";
            case 1 -> compChoice = "rock";
            case 2 -> compChoice = "paper";
        }
    
        switch(userGuess){
            case 0 -> userChoice = "scissor";
            case 1 -> userChoice = "rock";
            case 2 -> userChoice = "paper";
        }

        if(compGuess==userGuess){
            System.out.println("The computer is " + compChoice + ". You are " + userChoice + " too. It is a draw");
        }
        else if((compGuess == 0 && userGuess == 1) || (compGuess == 1 && userGuess == 2) || (compGuess == 2 && userGuess == 0)){
            System.out.println("The computer is " + compChoice + ". You are " + userChoice + ". You won");
        }
        else{
            System.out.println("The computer is " + compChoice + ". You are " + userChoice + ". You lost");
        }

        sc.close();
    }
}
