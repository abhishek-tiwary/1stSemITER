public class Home_CMD_Q2_CylinderArea {
    public static void main(String[] args) {
        double h= Double.parseDouble(args[0]);
        double r= Double.parseDouble(args[1]);
        double area= Math.PI*r*r + 2*Math.PI*r*h;

        System.out.println("The surace area of the cylinder is " + area);
    }
}
