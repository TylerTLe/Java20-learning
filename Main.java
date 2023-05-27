import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // int age = 22;
        // double gpa = 3.75;
        // char firstinital = 'T';
        // char lastinital = 'L';
        // Boolean perfectattendence = false;
        // String studentFirstName = ("Tyler");
        // String studentLastName = ("le");

        // To get index in java use .charAt

        // System.out.println(age);
        // System.out.println(gpa);
        // System.out.println(firstinital);
        // System.out.println(lastinital);
        // System.out.println(perfectattendence);
        // System.out.println(studentFirstName + " " + studentLastName + " has a GPA of: " + gpa);
        // System.out.println(studentLastName.charAt(1));


        // Must create scanner object to get user inputs

        // System.out.println("What do you wan to update the GPA to?");
        // Scanner myobj = new Scanner(System.in);
        // Double GPA = myobj.nextDouble();
        // System.out.println("New GPA is now: " + GPA);  // Output user input

        // < Less than | > Greater than | == Equals to | <= Less than or equal to | >= greater than or equal to 
        // If statements

        // System.out.println("pick a number between one and ten");
        // Scanner scanner = new Scanner(System.in);
        // int num = scanner.nextInt();

        // if (num < 5) {
        //     System.out.println("Enjoy the good luck a friend brings you");
        // } else {
        //     System.out.println("you will have a good day");
        // }

        // While loops 
            // Scanner input = new Scanner(System.in);
            // boolean isOnRepeat = true;

            // while (isOnRepeat) {
            //     System.out.println("playing current song");
            //     System.out.println("Would you like to take this song off of repeat? Is so, answer yes");
            //      String userInput = input.next();

            //      if (userInput.equals("yes")) {
            //         isOnRepeat = false;
            //      } else {
            //         isOnRepeat = true;
            //      }
            //      System.out.println("playing next song");

            // }


            String question = "what fruit do monkeys like most";
            String choiceOne = "apples";
            String choiceTwo = "bananas";
            String choiceThree = "pineapple";
            String correctAnswer = choiceTwo;

            System.out.println(question);
            System.out.println(choiceOne + ", " + choiceTwo + " or " + choiceThree);

            Scanner scanner = new Scanner(System.in);
            String userInput = scanner.nextLine();

            if (correctAnswer.equals(userInput.toLowerCase())) {
                System.out.println("Congrats you pick the right answer");
            } else {
                System.out.println("Wrong answer!");
            }
            // Must close scanner
            scanner.close();
    }
}
