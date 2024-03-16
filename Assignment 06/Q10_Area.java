public class Q10_Area {
    public static void main(String[] args) {
        System.out.println("Area of triangle is " + area(5, 10));
        System.out.println("Area of square is " + area(6.10));
        System.out.println("Area of circle is " + area(8));
        System.out.println("Area of rectangle is " + area(7.8, 8.5));
    }

    public static double area(int base, int height)
    {
        return(0.5*base*height);
    }
    public static double area(double side)
    {
        return(side*side);
    }
    public static double area(int radius)
    {
        return(Math.PI*radius*radius);
    }
    public static double area(double length, double breadth)
    {
        return(length*breadth);
    }
}
