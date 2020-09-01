import java.util.Scanner;

public class leapYear {

    public static boolean isLeapYear(int n) {
        if(n % 400 == 0) {
            return true;
        }
        if(n % 100 == 0) {
            return false;
        }
        if(n % 4 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the year");
        int n = scan.nextInt();
        if(isLeapYear(n)) {
            System.out.println("It is a Leap Year");
        } else {
        System.out.println("It is not a Leap Year");
        }
    }
}