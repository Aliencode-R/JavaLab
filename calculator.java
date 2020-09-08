import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter A and B");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        System.out.println("Enter operator");
        char op = scan.next().charAt(0);
        // int op = scan.nextInt();
        switch(op) {
            case '+': 
                System.out.println("ans = " + (a + b));
                break;
            case '-':
                System.out.println("ans = " + (a - b));
                break;
            case '*': 
                System.out.println("ans = " + (a * b));
                break;
            case '/': 
                if(b == 0) {
                    System.out.println("division by 0 is not possible");
                } else {
                    System.out.println("ans = " + (a / b));
                }
            case '^': 
                System.out.println("ans = " + Math.pow(a, b));
                break;
            default: 
                System.out.println(" Invalid operand" );
        }

    }
}
