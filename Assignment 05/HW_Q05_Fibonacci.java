import java.util.Scanner;
public class HW_Q05_Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int a = 0, b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        sc.close();
        // 0, 1, 1, 2, 3, 5, 8, 13, ...
    }
}
