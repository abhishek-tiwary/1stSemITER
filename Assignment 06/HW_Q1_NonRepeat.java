import java.util.Scanner;
public class HW_Q1_NonRepeat {

    public static char helper(String s){
        for(int i =0; i<s.length() ; i++){
            int count=0;
            for(int j=0; j<s.length(); j++){
                if(s.charAt(i)==s.charAt(j)){
                    count++;
                }
            }
            if (count==0){
                return s.charAt(i);
            }  
            
        }
        return ' ';
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str1= sc.nextLine();
        System.out.println(helper(str1));
        sc.close();
    }
}
