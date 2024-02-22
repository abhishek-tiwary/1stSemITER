public class HW_Q02_MultipleOf3Or5 {
    public static void main(String args[]){
        int sum1 =0, sum2= 0, sum3= 0;
        for(int i= 1; i<1000; i++){
            if(i%3== 0){
                sum1 = sum1 + i;
            }
            if(i%5== 0){
                sum2 = sum2 + i;
            }
            if(i%15== 0){
                sum3= sum3 +i;
            }
        }
        int sum = (sum1+ sum2)-sum3;
        System.out.println("The sum of multiples of 3 or 5 below 1000 is " + sum);
    }
}
