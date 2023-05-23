import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int age = 22;
        double gpa = 3.75;
        char firstinital = 'T';
        char lastinital = 'L';
        Boolean perfectattendence = false;
        String studentFirstName = ("Tyler");
        String studentLastName = ("le");

        // To get index in java use .charAt
        System.out.println(age);
        System.out.println(gpa);
        System.out.println(firstinital);
        System.out.println(lastinital);
        System.out.println(perfectattendence);
        System.out.println(studentFirstName + " " + studentLastName + " has a GPA of: " + gpa);
        System.out.println(studentLastName.charAt(1));


        // Must create scanner object to get user inputs
        System.out.println("What do you wan to update the GPA to?");
        Scanner myobj = new Scanner(System.in);
        Double GPA = myobj.nextDouble();
        System.out.println("New GPA is now: " + GPA);  // Output user input
    }
}
