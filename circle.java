import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double radius = scan.nextDouble();
        double pi = 3.14;
        double area = pi * radius * radius;
        System.out.println("Area of circle : " + area);
    }
}
