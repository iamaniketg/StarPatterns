import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
 	    for (int i = 1; i <= n ; i++) {
            for (int j = 0; j <= n- i -1 ; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <= i ; j++) {
                System.out.print(j+" ");
            }

            for (int j = 1; j < i ; j++) {
                System.out.print(0+" ");
            }

            for (int j = 1; j < i-1 ; j++) {
                System.out.print(0+" ");
            }
            for (int j = i; j <= i && j != 1; j++) {

                System.out.print(j+" ");
            }
            System.out.println();
      }
	}
}
   