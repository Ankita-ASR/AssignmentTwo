import java.util.Scanner;
public class TransformNumberToMonthName {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter a number between 1 and 12: ");
            int monthNumber = scanner.nextInt();

            if (monthNumber >= 1 && monthNumber <= 12) {
                String months = "January   February  March     April     May       June      July      August    September October   November  December ";
                int startIndex = (monthNumber - 1) * 10;
                int endIndex = startIndex + 9;
                String monthName = months.substring(startIndex, endIndex);
                System.out.println("The corresponding month name is: " + monthName);
            } else {
                System.out.println("Invalid input. ");
            }
        }
    }




