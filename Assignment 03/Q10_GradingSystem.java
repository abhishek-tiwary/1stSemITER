import java.util.Scanner;
public class Q10_GradingSystem {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the marks of 5 subjects");
        float m1=sc.nextFloat();
        float m2=sc.nextFloat();
        float m3=sc.nextFloat();
        float m4=sc.nextFloat();
        float m5=sc.nextFloat();
        float total=m1 + m2 + m3 + m4 + m5;

        System.out.println("Your total marks is "+ total);
        float percentage= (total/500)*100;

        System.out.println("Your percentage is " + percentage + "%");

        int marks= (int)total/50;
        String grade= "";

        switch(marks){
            case 10, 9 -> grade = "O";
            case 8 -> grade = "A";
            case 7 -> grade = "B";
            case 6 -> grade = "C";
            case 5 -> grade = "D";
            case 4 -> grade = "E";
            case 3, 2, 1, 0 -> grade = "F";
            default-> grade = "Wrong Input";
        }
        System.out.println("Your grade is " + grade);
        sc.close();
    }
}

       