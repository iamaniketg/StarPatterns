import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    // Upper half of the pattern
        for (int i = n; i >= 1; i--) {
            
            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            
            System.out.println();
        }
        
        // Lower half of the pattern
        for (int i = 2; i <= n; i++) {
            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            
            System.out.println();
        }
	}
}
