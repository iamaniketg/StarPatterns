import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		  for (int i = 1; i <= n; i++) {
            // Print numbers in decreasing order
            for (int j = n; j > i; j--) {
                System.out.print(j+" ");
            }
            
            // Print the asterisk
            System.out.print("* ");
            
            // Print numbers in increasing order
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(j+" ");
            }

            System.out.println();
        }
        
        }
}
