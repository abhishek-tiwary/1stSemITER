import java.util.Scanner;
public class Q7_Vowels {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your word");
        String str= sc.nextLine();
        System.out.println("The number of vowles in your word are " + count(str));
        sc.close();
    }

    public static int count(String str) {
        str = str.toLowerCase();
        int vowelCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                vowelCount++;
        }
        return vowelCount;
    }
}