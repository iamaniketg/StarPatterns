import java.util.*;
public class Main
{
	public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int num = 1;

        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= (n - i) * 2; j++) {
                System.out.print(" ");
            }

            // Print numbers
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print(num + " ");
            }

            num++;
            System.out.println();
        }
    }
}