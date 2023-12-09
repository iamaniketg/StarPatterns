import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int n = 10;

        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= (n - i) * 2; j++) {
                System.out.print(" ");
            }
            
            // Print numbers in decreasing order
            for (int j = n - i + 1; j <= n-1; j++) {
                System.out.print(j + " ");
            }
            
            // Print the zero
            System.out.print("0 ");
            
            // Print numbers in increasing order
            for (int j = n-1; j >= n - i + 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
	}
}
   