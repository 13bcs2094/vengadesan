package venkat;

import java.util.Scanner;

public class index {
     public static void main(String[] args) 
     {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		for (int i = 0; i < a.length; i++) 
		{
		a[i]=sc.nextInt();	
		}
		for (int i = 0; i < a.length; i++)
		{
				if(a[i]==i)
				{
					System.out.println(a[i]+" equals to its"+i);
				}
			
		}
		
	}
}
