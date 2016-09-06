
package internal.cells;
import java.util.Scanner;


public class specific element {
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int a[]=new int[50];
        for (int i = 0; i < a.length; i++) 
        {
            a[i]=sc.nextInt();
        }
        int temp;
         for(int j=0;j<a.length;j++)
         {
             for(int k=0;k<a.length;k++)
             {
                 if(a[j]>a[k])
                 {
                     temp=a[j];
                     a[j]=a[k];
                     a[k]=temp;
                 }
             }
         }
         for(int m=0;m<a.length;m++)
         {
             System.out.print(a[a.length-4]);
         }
    }
    
}
