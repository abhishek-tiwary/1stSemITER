import java.util.Scanner;

public class Q09_Series2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();           // let n = 2

        double sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += 1.0 / (i * i);
        }

        System.out.print(sum);         // sum of series = 1.6439345666815615
        sc.close();
    }
    // 1/1^2 + 1/2^2 + 1/3^2 + 1/4^2 + ... + 1/n^2
}
