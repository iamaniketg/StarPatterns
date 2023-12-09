import java.util.*;
public class Main
{
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int num = 1;
    for (int i = 0; i < n; i++) {
      // print spaces
      for (int j = 0; j < n-i-1; j++) {
        System.out.print("  ");
      }
      // print numbers
      for (int k = 0; k < 2*i+1; k++) {
        System.out.print(num+++" ");
      }
      num = 1;
      System.out.println();
    }
	}
}