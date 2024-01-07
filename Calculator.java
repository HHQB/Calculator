import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {


        double num1;
        double num2;
        String command;
        Scanner scanner = new Scanner(System.in);


        System.out.println("What is the first number you want to use?");
        num1 = scanner.nextInt();
        System.out.println("What is the second number you want to use?");
        num2 = scanner.nextInt();

        scanner.nextLine();

        System.out.println("What do you want to do with these numbers?");
        command = scanner.nextLine();


       
       
        switch(command) {
            case "Add": System.out.println("You're answer is: " + (num1 + num2));
            break;
            case "Subtract": System.out.println("You're answer is: " + (num1 - num2));
            break;
            case "Multiply": System.out.println("You're answer is: " + (num1 * num2));
            break;
            case "Divide": System.out.println("You're answer is: " + (num1 / num2));
            break;
            default: System.out.println("That is not a command lol");
        }
    }
}
