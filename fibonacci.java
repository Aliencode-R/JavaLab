import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int i = 1;
        int a = 0, b = 1;
        System.out.println("First "+ n +" fibonacci numbers are:");
        do{
        System.out.println(a);
            int c = a+b;
            a = b;
            b = c;
            i++;
        } while (i <= n);

    }
}