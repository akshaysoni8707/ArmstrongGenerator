import java.util.InputMismatchException;
import java.util.Scanner;

public class ArmstrongNumberChecker {
    private int number;
    private int sum = 0;
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        new ArmstrongNumberChecker().mainMethod();
    }

    private void mainMethod() {
        try {
            System.out.println("\nEnter the number to check if it is armstrong number\n");
            number = scanner.nextInt();
            armstrongChecker();
        } catch (InputMismatchException e) {
            System.out.println(e + "\t : Only integers allowed");
        }
    }

    private void armstrongChecker() {
        String s = Integer.toString(number);
        char[] c = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            sum = ( int ) (sum + Math.pow((c[i] - 48), c.length));
        }
        if (sum == number) {
            System.out.println("Number " + number + " is Armstrong");
        } else {
            System.out.println("Number " + number + " is not Armstrong");
        }
    }
}
