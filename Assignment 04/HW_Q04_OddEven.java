import java.util.Scanner;
public class HW_Q04_OddEven {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int num= sc.nextInt();
        int sum= 0, product=1;
        for(int i=1; i<=num; i++){
            if(i%2==0){
                sum= sum+i;
            }
            
            if(i%2==1){
                product= product*i;
            }
        }
        System.out.println("The sum of all even numbers under " + num + " is " + sum);
        System.out.println("The product of all odd numbers under" + num + " is " + product);
        sc.close();
    }
    
}
