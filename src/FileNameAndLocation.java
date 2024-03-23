import java.util.Scanner;
public class FileNameAndLocation {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the drive letter: ");
            String driveLetter = scanner.nextLine();
            System.out.println("Enter the path: ");
            String path = scanner.nextLine();
            System.out.println("Enter the file name: ");
            String fileName = scanner.nextLine();
            System.out.println("Enter the extension: ");
            String extension = scanner.nextLine();
            String completeFileName = driveLetter + ":\\" + path + "\\" + fileName + "." + extension;
            System.out.println("Complete file name: " + completeFileName);
        }
    }

