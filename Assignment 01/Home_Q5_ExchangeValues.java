public class Home_Q5_ExchangeValues{
    public static void main(String[] args){
        int W=1;
        int G=2;
        int K=3;
        int A=4;
        int X;

        System.out.println("W = " + W + " G = " +G + " K = " + K + " A = " +A);

        X= W;
        W= G;
        G= K;
        K= A;
        A= X;

        System.out.println("W = " + W + " G = " +G + " K = " + K + " A = " +A);

        int w=10;
        int g=20;
        int k=30;
        int a=40;

        System.out.println("w = " + w + " g = " +g + " k = " + k + " a = " +a);

        // swapping w and g variables
        w = w + g;
        g = w - g;
        w = w - g;
 
        // swapping g and k variables
        g = g + k;
        k = g - k;
        g = g - k;
 
        // swapping k and a variables
        k = k + a;
        a = k - a;
        k = k - a;
        
        System.out.println("w = " + w + " g = " +g + " k = " + k + " a = " +a);
    }
}