import java.util.*;
public class Main
{
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int num = 1;
		for (int i = 1; i <= n; i++) {
            // Print initial spaces
            for (int j = 1; j <= (n - i) * 2; j++) {
                System.out.print(" ");
            }

            // Print numbers in ascending order
            for (int j = num; j <= num + i - 1; j++) {
                System.out.print(j + " ");
            }

            // Print numbers in descending order
            for (int j = num + i - 2; j >= num; j--) {
                System.out.print(j + " ");
            }

            num++;
            System.out.println();
        }
	}
}