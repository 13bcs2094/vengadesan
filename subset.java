
package internal.cells;
import java.util.Scanner;


public class subset{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int a[]=new int[5];
        for (int i = 0; i < a.length; i++) 
        {
            a[i]=sc.nextInt();
        }
         int b[]=new int[5];
        for (int i = 0; i < b.length; i++) 
        {
            b[i]=sc.nextInt();
        }
        int temp=0;
        for (int i = 0; i <a.length; i++)
        {
            for(int j=0;j<b.length;j++)
            {
                if(a[i]==b[j])
                {
                    temp++;
                }
            }
        }
      if(b.length==temp)
      {
          System.out.println("A is a subset of b" );
      }
      else
      {
                 System.out.println("A is not a subset of b" );
      }
    }
    
}
