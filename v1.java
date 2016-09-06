
package internal.cells;
import java.util.Scanner;


public class v1 {
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int a[]=new int[5];
        for (int i = 0; i < a.length; i++) 
        {
            a[i]=sc.nextInt();
        }
        int k;
        for (int i = 0; i <=a.length; i++) 
        {
            
           k = a[(i%2)+2];
             int y;
           y = a[(i%2)+1]+a[i%2];
             //System.out.println(y+" "+k+" ");
            if(k==y)
            {
               System.out.println(" "+a[y]+" "+a[k]);
               break;
            }
        }
      
    }
    
}
