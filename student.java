import java.util.Scanner;

public class student {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number of students");
        int n = scan.nextInt();

        double Total = 0;

        while(n-- > 0) {
            double english, hindi, maths, science, sst; 
            System.out.println("Student");
            System.out.println("Enter marks in English");
            english = scan.nextDouble();

            System.out.println("Enter marks in hindi");
            hindi = scan.nextDouble();

            System.out.println("Enter marks in maths");
            maths = scan.nextDouble();

            System.out.println("Enter marks in science");
            science = scan.nextDouble();

            System.out.println("Enter marks in social science");
            sst = scan.nextDouble();

            double total = english + hindi + maths + science + sst;
            Total += total;
            double avg = (total / 5);

            System.out.println("Percentage = " + avg);
            char grade;
            if(avg >= 80) {
                grade = 'a';
            }
            else if(avg >= 60) {
                grade = 'b';
            }
            else if(avg >= 40) {
                grade = 'c';
            }   
            else if(avg >= 30) {
                grade = 'd';
            }   
            else {
                grade = 'F';
            }
            System.out.println("Grade = " + grade);
        }
        double avg = Total / (n*5);
            System.out.println("Average of n students is " + -1*avg  );

    }
}