import java.util.Scanner;

public class user {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name, fName, mName;
        long phNO;
        int age, wt, ht;

        System.out.println("Enter name");
        name = scan.next();
        System.out.println("Enter Father's name");
        fName = scan.next();
        System.out.println("Enter Mother's name");
        mName = scan.next();
        System.out.println("Enter age");
        age = scan.nextInt();
        System.out.println("Enter phone no.");
        phNO = scan.nextLong();
        System.out.println("Enter weight in kg");
        wt = scan.nextInt();
        System.out.println("Enter height in cm");
        ht = scan.nextInt();

        System.out.println("Name: " + name);
        System.out.println("Father's Name: " + fName);
        System.out.println("Mother's Name: " + mName);
        System.out.println("Age: " + age);
        System.out.println("Phone number: " + phNO);
        System.out.println("height : " + ht + " cm");
        System.out.println("weight : " + wt + " kg");

    }
}
