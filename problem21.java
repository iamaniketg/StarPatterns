import java.util.*;
public class Main
{
	public static void main(String[] args) {
	 Scanner cs=new Scanner(System.in);
       int out,in;
       int row_size=cs.nextInt();
       for(out=1;out<=row_size;out++)
       {
           for(in=1;in<row_size*2;in++)
           {
               if(in<=out || in>=row_size*2-out)
               {
                  System.out.printf("* ");
               }
               else
               {
                System.out.printf("  ");    
               }
           }
           System.out.println(); 
       }
    }
}