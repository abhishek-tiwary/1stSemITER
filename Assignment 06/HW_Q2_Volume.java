public class HW_Q2_Volume {
    public static void main(String args[]){
        System.out.println("The volume of the sphere is " + area(5));
        System.out.println("The volume of the cuboid is " + area(5, 6, 7));
        System.out.println("The volume of the cube is " + area(5.10));
    }
    public static double area(int radius){
        return (4.0/3 * Math.PI * radius * radius * radius);
    }
    public static int area(int length, int breadth, int height){
        return(length * breadth *height);
    }
    public static double area(double side){
        return (side*side*side);
    }
}
