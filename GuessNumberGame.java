import java.util.Scanner;

public class GuessNumberGame {
    static Scanner scan = new Scanner(System.in);
    public static void guess(){
        System.out.println("Think of a number between 1 and 100\n");

        int lower = 1;
        int upper = 100;
        int guess = (lower + upper) / 2;

        while (true) {
            System.out.println("Is your number less than " + guess + "? (true/false)");
            String response = scan.next();

            if (response.equalsIgnoreCase("true")) {
                upper = guess - 1;
            } else if (response.equalsIgnoreCase("false")) {
                lower = guess + 1;
            } else {
                System.out.println("Please enter 'true' or 'false'.");
                continue;
            }

            guess = (lower + upper) / 2;

            if (lower > upper) {
                System.out.println("Your number is: " + guess);
                break;
            }
        }
    }

    public static void main(String[] args) {
        guess();
    }
}