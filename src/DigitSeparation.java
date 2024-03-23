//digit separation in reversed way
import java.util.Scanner;
public class DigitSeparation {
    public static void main(String[] args) {
        int i;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        int number = scanner.nextInt();
        int temp = number;
        while (temp != 0) {
            int reminder = temp % 10;
            System.out.print(reminder + " ");
            temp = temp / 10;
        }
    }

}


