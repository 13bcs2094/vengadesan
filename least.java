package pro;

import java.util.Scanner;

public class least {
          public static void main(String[] args)
          {
        	  Scanner sc=new Scanner(System.in);
        	  int k=sc.nextInt();
	          int a[]=new int[5];
	          for (int i = 0; i < a.length; i++) 
	          {
				a[i]=sc.nextInt();
			}
	          int temp;
	          for (int i = 0; i < a.length; i++) 
	          {
				for (int j = i+1; j < a.length; j++)
				{
					if(a[i]>a[j])
					{
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
			}
	          for (int i = 0; i < a.length; i++) 
	          {
				//System.out.println(a[i]);
			}
	          int q=a.length-k;
	          for (int i =0; i <k; i++)
	          {
	          System.out.print(a[i]);
}
          }
}
