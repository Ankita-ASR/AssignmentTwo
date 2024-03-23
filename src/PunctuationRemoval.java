import java.util.Scanner;
public class PunctuationRemoval {
    public static void main(String[] args) {
    System.out.print("Please enter an integer between 1,000 and 999,999: ");
    Scanner scanner = new Scanner(System.in);
    String number = scanner.next();
    String newNumber = number.replace(",", "");
    System.out.println(newNumber);
}
}
