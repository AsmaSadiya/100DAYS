
import java.util.Scanner;

public class Pattern20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();

        for (char i = 'A'; i <= 'E'; i++) {
            char m = 'E';

            for (char j = 'A'; j <= i; j++) {
                System.out.print(m-- + " ");
            }
            System.out.println(" ");

        }
    }
}