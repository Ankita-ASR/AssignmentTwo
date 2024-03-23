import java.util.Scanner;
public class MilitaryFormatTime {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Please enter the first time in military format : ");
            String firstTimeInput = scanner.nextLine();
            int firstTime = Integer.parseInt(firstTimeInput.substring(0, 2)) * 60 + Integer.parseInt(firstTimeInput.substring(2));

            System.out.print("Please enter the second time in military format : ");
            String secondTimeInput = scanner.nextLine();
            int secondTime = Integer.parseInt(secondTimeInput.substring(0, 2)) * 60 + Integer.parseInt(secondTimeInput.substring(2));

            int timeDifference = (secondTime - firstTime + 24 * 60) % (24 * 60);

            int hours = timeDifference / 60;
            int minutes = timeDifference % 60;

            System.out.println("Time difference: " + hours + " hours " + minutes + " minutes");
        }
    }

