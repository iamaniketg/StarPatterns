import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter odd n only: ");
        int n = sc.nextInt();

        // Upper half of the pattern
        for (int i = 1; i <= n / 2; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= n / 2 - i + 1 || j > n / 2 + i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(" ");
        }
        System.out.println();

        // Lower half of the pattern
        for (int i = n / 2; i >= 1; i--) {
            for (int j = 1; j <= n; j++) {
                if (j <= n / 2 - i + 1 || j > n / 2 + i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
	}
}
