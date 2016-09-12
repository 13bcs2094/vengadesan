package hunter;

import java.util.Scanner;

public class reversestring {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String a[]=s.split(" ");
		int n=a.length-1;
		for (int i = n; i >=0; i--)
		{
			System.out.print(a[i]);
		}
	}

}
//11
