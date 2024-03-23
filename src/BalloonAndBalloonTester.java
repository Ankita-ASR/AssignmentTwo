import java.util.Scanner;
public class BalloonAndBalloonTester {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter a year: ");
            int year = scanner.nextInt();
            int a = year % 19;
            int b = year / 100;
            int c = year % 100;
            int d = b / 4;
            int e = b % 4;
            int g = (8 * b + 13) / 25;
            int h = (19 * a + b - d - g + 15) % 30;
            int j = c / 4;
            int k = c % 4;
            int m = (a + 11 * h) / 319;
            int r = (2 * e + 2 * j - k - h + m + 32) % 7;
            int n = ( h - m + r + 90) / 25;
            int p = ( h - m + r + n + 19) % 32;
            switch (n) {
                case 1:
                    System.out.printf("Easter Sunday fell on January %d",p);
                    break;
                case 2:
                    System.out.printf("Easter Sunday fell on February %d",p);
                    break;
                case 3:
                    System.out.printf("Easter Sunday fell on March %d",p);
                    break;
                case 4:
                    System.out.printf("Easter Sunday fell on April %d",p);
                    break;

            }
        }
    }
