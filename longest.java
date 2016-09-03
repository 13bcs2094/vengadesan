package pro;

import java.util.Scanner;

public class longest {
           
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String[] a=s1.split(" ");
		String s2=sc.nextLine();
		String b[]=s2.split(" ");
		for (int i = 0; i < b.length; i++)
		{
			//System.out.println(b[i]);
		}
		for (int i = 0; i < a.length; i++)
		{	
			for (int j = 0; j < b.length; j++) 
			{	
			if(s1.charAt(i)==s2.charAt(j))
				{
					System.out.println(a[i]);
				}
			}
		}
		}
	}
//i am a good boy
//i am a bad boy
