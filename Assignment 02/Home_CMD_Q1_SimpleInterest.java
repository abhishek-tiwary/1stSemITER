public class Home_CMD_Q1_SimpleInterest {
    public static void main(String[] args) {
        double principle= Double.parseDouble(args[0]);
        double rate= Double.parseDouble(args[1]);
        double time= Double.parseDouble(args[2]);

        double pi= (double)((principle*rate*time)/100);
        System.out.println("The Simple Interest is " + pi);

    }
}
