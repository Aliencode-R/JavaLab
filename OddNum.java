import java.util.Scanner;

public class OddNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 20;
        for(int i = 1; i <= n; i++) {
            if(i % 2 == 0) continue;
            System.out.println(i);
        }
    }
}