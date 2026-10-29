// Import the Scanner from Java utility.
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("What is your GPA: ");
        double gpa = scanner.nextDouble();

        System.out.print("Do you have a job? (true/false) ");
        boolean job = scanner.nextBoolean();


        System.out.println("Hello " + name);
        System.out.println("So you are " + age +"years old! Nicee!!");

        if(gpa >= 3.0 && gpa <= 4.0){
            System.out.println("So your GPA is "+gpa+".\nYou are a Good Student.");
        }else {
            System.out.println("So your GPA is "+gpa+".");
        }

        if (job){
            System.out.println("Nice you have a job!");
        }else {
            System.out.println("Try to find a job.");
        }

        // Scanner Closing.
        scanner.close();
    }
}
