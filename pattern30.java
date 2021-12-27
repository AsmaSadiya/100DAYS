
import java.util.Scanner;

public class Pattern30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();

        for (char i = 'E'; i >= 'A'; i--) {
            for (char j = 'A'; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
        for (char i = 'E' - 3; i <= 'E'; i++) {
            for (char j = 'A'; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println(" ");
        }

    }
}
