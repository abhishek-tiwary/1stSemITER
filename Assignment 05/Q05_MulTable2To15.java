public class Q05_MulTable2To15 {
    public static void main(String[] args) {
        int mul=1;
        for(int i=2; i<=15; i++){
            System.out.println("Multiplication table of " + i);
            for(int j=1; j<=10; j++){
                
                mul=i*j;
                System.out.println(i + " X " + j + " = " + mul);
            }
        }
    }
}
