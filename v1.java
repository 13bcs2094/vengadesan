package venkat;

import java.util.Scanner;

public class v1 {
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String a[]=new String[n];
		int x=a.length-1;
		for (int i = 0; i < a.length; i++)
		{
			a[i]=sc.next();
		}
		String s="";
		for (int i = 0; i < a.length; i++) 
		{
			s=s+a[i];
        }
		System.out.println(s);
		String s1="";
		for (int i = 0; i < a.length; i++)
		{
			s1=s1+a[x];
			x--;
		}
		System.out.println(s1);
		if(s.equals(s1))
		{
			System.out.println("Both Strings are equal");
		}
		else
		{
			System.out.println("Both Strings are not equal");
		}
	}

}
