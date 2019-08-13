import java.util.InputMismatchException;
import java.util.Scanner;

public class ArmstrongNumberGenerator {
    private Scanner scanner = new Scanner(System.in);
    private int firstNumber;
    private int lastNumber;
    private int sum = 0;

    public static void main(String[] args) {
        new ArmstrongNumberGenerator().mainMethod();
    }

    private void mainMethod() {
        try {
            System.out.println("\nYou will haveto enter initial and final number between which all the armstrong numbers you want to generate\n");
            System.out.println("\nEnter the initial number\n");
            firstNumber = scanner.nextInt();
            System.out.println("\nEnter the final number\n");
            lastNumber = scanner.nextInt();
            armstrongGenerator(firstNumber, lastNumber);
        } catch (InputMismatchException e) {
            System.out.println(e + "\t: Only integers allowed as input");
        }
    }

    private void armstrongGenerator(int firstNumber, int lastNumber) {
        if (firstNumber == lastNumber) {
            System.out.println("both initian and final numbers are same , no range to generate armstrong numbers");
        } else {
            if (firstNumber > lastNumber) {
                System.out.println("initial number is greater than final number so i will alter them and make a range from " + lastNumber + " to " + firstNumber);
                int temp = firstNumber;
                firstNumber = lastNumber;
                lastNumber = temp;
            }
            do {
                String s = Integer.toString(firstNumber);
                char[] c = s.toCharArray();
                for (int i = 0; i < s.length(); i++) {
                    sum = ( int ) (sum + Math.pow((c[i] - 48), c.length));
                }
                if (sum == firstNumber) {
                    System.out.println("Number " + firstNumber + " is Armstrong");
                }
                ++firstNumber;
                sum = 0;
            } while (firstNumber <= lastNumber);
        }
    }
}