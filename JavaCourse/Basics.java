package JavaCourse;
import java.util.Scanner;
// ^ Must import scanner to get user input

public class Basics {

    public static void main(String[] args) {
                
        String x = "water";
        String y = "Kool-aid";
        String temp;

        temp = x;
        x=y;
        y=temp;

        System.out.println("X: "+x);
        System.out.println("Y: "+y);

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("What is your favorite food");
        String food = scanner.nextLine();


    }
}
