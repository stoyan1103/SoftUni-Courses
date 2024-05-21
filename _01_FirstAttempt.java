import java.util.Scanner;

public class _01_FirstAttempt {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = Integer.parseInt(scanner.nextLine());

        System.out.printf("You chose number: %d\n", number);
        System.out.println(10);

    }
}