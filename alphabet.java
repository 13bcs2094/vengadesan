package pro;

import java.util.Scanner;

public class alphabet
{
	static Scanner in=new Scanner(System.in);
public static void main(String[] args) 
{
	
	String s=in.nextLine();
	int a=s.length();
	String s1="abcdefghijklmnopqrstuvwxyz";
	int b=s1.length();
	int temp=0;
	for(int i=0;i<a;i++)
	{
		for(int j=0;j<b;j++)
		{
			if(s.charAt(i)==s1.charAt(j))
			{
				temp++;
			}
		}
	}
		if(temp==a)
		{
			System.out.println("It is a panagram");
		}
		else
		{
			System.out.println("It is not a panagram");
		}
}
}
