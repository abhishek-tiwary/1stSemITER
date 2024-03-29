import java.util.Scanner;

public class Q08_Series1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: "); // when n = 3
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                sum += j;
            }
        }

        System.out.println(sum); // sum of the series = 10 
        sc.close();
        // 1 + (1 + 2) + (1+ 2 +3) ..... + (1 + 2 + 3 + .... + n)
    }
    
}
