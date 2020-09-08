import java.util.Scanner;

public class SumBreak {
    public static void main(String[] args) {
        System.out.println("enter numbers");
        Scanner scan = new Scanner(System.in);
        int i = 0;
        int sum = 0;
        while(true) {
            sum += i;
            i = scan.nextInt();
            if(i < 0) break;
        }
        System.out.println("Sum is " + sum);
    }
}