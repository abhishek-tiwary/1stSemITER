public class HW_Q01_SquaresDiff {
    public static void main(String args[]){
        int sum1= 0; 
        int sum = 0;
        int sum2= 0;
        for(int i=1; i<=10; i++){
            sum1= sum1+ (int)Math.pow(i, 2);
        }
        for(int i=1; i<=10; i++){
            sum= sum+i;
            sum2= (int)Math.pow(sum, 2);
        }
        System.out.println("The sum of the squares of the first ten natural numbers is: " + sum1);
        System.out.println("The square of the sum of the first ten natural numbers is: " + sum2);

        int diff = sum2-sum1;
        System.out.println("Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is " + sum2 + " - " + sum1 + " = " + diff);

    }
}
