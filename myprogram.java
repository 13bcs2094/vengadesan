
package my_program;

import java.util.Scanner;

public class My_program
{

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int a[]=new int[5];
        
        for (int i = 0; i < 5; i++)
        {
           a[i]=sc.nextInt();
        }
        for (int i = 0; i < a.length; i++)
        {
            for (int j = 1; j < a.length; j++) 
            {
                int n=a[i]+a[j];
              if(k==n)  
              {
                  System.err.println("k");
              }
            }
        }
       
    }
    
}
