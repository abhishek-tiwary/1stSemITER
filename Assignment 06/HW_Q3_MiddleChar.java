import java.util.Scanner;
public class HW_Q3_MiddleChar {
    public static char MidChar(String str){
        
        if(str.length()%2==0){
            char ch= str.charAt((str.length()+1)/2);
            return ch;
        }
        else {
            char ch= str.charAt(str.length()/2);
            return ch;
        }
   }
   public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your string");
        String str= sc.nextLine();
        System.out.println("The middle character of the string is " + MidChar(str));
        sc.close();
   }
}
