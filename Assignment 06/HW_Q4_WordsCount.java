import java.util.Scanner;
public class HW_Q4_WordsCount {
    public static int Count (String str){
        int count =1;
        for(int i=0; i<str.length(); i++){
            char ch= str.charAt(i);
            if(ch== ' '){
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your sentence");
        String str= sc.nextLine();
        System.out.println("The number of words in your sentence is " + Count(str));
        sc.close();
    }
}
