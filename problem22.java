import java.util.*;
public class Main
{
	public static void main(String[] args) {
	 Scanner cs=new Scanner(System.in);
       int out,in;
       int row_size=cs.nextInt();
       int print_control_x=row_size;
       int print_control_y=row_size;
       for(out=1;out<=row_size;out++)
       {
           for(in=1;in<row_size*2;in++)
           {
               if(in>print_control_x && in<print_control_y)
               {
                  System.out.printf("  ");
               }
               else
               {
                System.out.printf("* ");    
               }
           }
           print_control_x--;
           print_control_y++;
           System.out.println(); 
       }
    }
}