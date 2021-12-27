import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int m = 5;

            for (int j = 1; j <= i; j++) {
                System.out.print(m-- + " ");
            }
            System.out.println(" ");

        }
    }
}