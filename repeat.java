package hunter;

import java.util.Scanner;

public class repeat {
                       
	private static Scanner sc;

	public static void main(String[] args) 
	{
		sc = new Scanner(System.in);
		int a[]=new int[10];
		for (int i = 0; i < a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		//System.out.println(b.length);
		int c[]=new int[10];
		int temp=0;
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]==a[j])
				{
					int h=temp+1;
					c[i]=h;
					//System.out.println(temp+" "+a[]);
				}
			}
			
			//System.out.println(c[i]);
		}
		
		for (int i = 0; i < c.length; i++)
		{
			System.out.println(c[i]);
			
		}
	}
}
//1 2 3 4 5 6 7 8 9 1
