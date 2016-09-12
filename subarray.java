package hunter;

import java.util.Scanner;

public class subarray {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[a.length];
		for (int i = 0; i < a.length; i++) 
		{
			a[i]=sc.nextInt();
		}
		for (int i = 0; i < a.length; i++)
		{
		b[i]=	a[i]+a[(i+1)%n]+a[(i+2)%n];
	
		}
		for (int i = 0; i < b.length; i++) 
		{
			System.out.print(b[i]+" ");
		}
		int max=0;
		
		for (int i = 0; i < b.length; i++) 
		{
			
			if(b[i]>max)
			{
				max=b[i];
			}
		}
for (int j = 0; j < b.length; j++)
{
	if(b[j]==max)
	{
		System.out.println(a[j]+" "+a[j+1]+" "+a[j+2]+" ");
	}
}

		
	}//15
}
