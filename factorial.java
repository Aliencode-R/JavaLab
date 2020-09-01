import java.util.Scanner;

public class factorial {
    public static int fact(int n) {
        int ans = 1;
        while(n >= 1) {
            ans *= n;
            n--;
        }
        return ans;
    }
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter no.");
        int a = scan.nextInt();
        System.out.println(fact(a));
    }
}