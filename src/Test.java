import java.util.Scanner;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username: ");
        String inputusername = sc.next();
        System.out.println("Enter password: ");
        String inputpassword = sc.next();

        if (inputusername.equals("Yunil") && (inputpassword.equals("Yunil123"))) {
            System.out.println("Logged in");
            System.out.println("Choose a program that you want to enter: ");
            System.out.println("1) Calculator");
            System.out.println("2) Guessing game");
            System.out.println("3) SI Calculator");
            System.out.println("4) Vowel or constant");
            int num = sc.nextInt();
            if (num == 1) {
                System.out.println("Calculator");
                int a, b, result;
                System.out.println("Enter two values: ");
                a = sc.nextInt(); // variable
                b = sc.nextInt();// variable
                System.out.println("Choose operator: +,-,*,/");
                String operators = sc.next();

                switch (operators) {
                    case "+":
                        result = a + b;
                        System.out.println("sum is: " + result);
                    case "-":
                        result = a - b;
                        System.out.println("subtraction is: " + result);
                    case "*":
                        result = a * b;
                        System.out.println("multiplication is: " + result);
                    case "/":
                        result = a / b;
                        System.out.println("Division is: " + result);
                }
            } else if (num == 2) {
                System.out.println("Guessing game");
                    Scanner scanner = new Scanner(System.in);
                    Random number = new Random();
                    int Number = number.nextInt(10) + 1;
                    boolean correctguess = false;
                    System.out.println("Guess a random number from 1 to 10..");

                    while (!correctguess) {
                        System.out.print("Guess the number: ");
                        int guess = scanner.nextInt();
                        if (guess < Number) {
                            System.out.println("Try higher number");
                        } else if (guess > Number) {
                            System.out.println("Try  lower number.");
                        } else {
                            correctguess = true;
                            System.out.println("Correct guess");
                        }
                    }
            } else if (num == 3) {
                System.out.println("SI calculator");
                double p, t, r, SI;
                System.out.println("Enter three values: ");
                System.out.println("Enter principle");
                p = sc.nextDouble();
                System.out.println("Enter time");
                t = sc.nextDouble();
                System.out.println("Enter rate");
                r = sc.nextDouble();
                SI = ((p * t * r) / 100);
                System.out.println("Simple interest is:" + SI);
            } else if (num == 4) {
                System.out.println("Vowel or constant");
                System.out.println("Enter alphabet: ");
                char alphabet = sc.next().charAt(0);
                switch (alphabet) {
                    case 'a', 'e', 'i', 'o', 'u':
                        System.out.println("Vowel");
                        break;
                    case 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z':
                        System.out.println("Consonant");
                        break;
                    default:
                        System.out.println("Invalid input");
                }
            }
        } else {
            System.out.println("Incorrect");
        }
    }
}
