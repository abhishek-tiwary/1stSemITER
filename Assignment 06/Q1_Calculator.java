import java.util.Scanner;
public class Q1_Calculator {
    public static int additionSimple(int x, int y) {
        return x + y;
    }

    public static int subtractionSimple(int x, int y) {
        return x - y;
    }

    public static int multiplicationSimple(int x, int y) {
        return x * y;
    }

    public static double divisionSimple(int x, int y) {
        if(x!=0){
        return (double) y / x;
        }
        return 0;
    }

    public static int remainderSimple(int x, int y) {
        return x % y;
    }

    public static double squareRootSimple(int x) {
        return x < 0 ? -1 : Math.sqrt(x);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter x and y");
        int x= sc.nextInt();
        int y= sc.nextInt();
        System.out.println("Enter operation required");
        char ch= sc.next().charAt(0);
        switch (ch){
            case '+' -> System.out.println(additionSimple(x, y));
            case '-' -> System.out.println(subtractionSimple(x, y));
            case '*' -> System.out.println(multiplicationSimple(x, y));
            case '/' -> System.out.println(divisionSimple(x, y));
            case '%' -> System.out.println(remainderSimple(x, y));
            case 'n' -> System.out.println(squareRootSimple(x));
        }
        sc.close();
    }
}