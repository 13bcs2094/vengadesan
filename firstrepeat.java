package venkat;
import java.util.Scanner;

public class firstrepeat {
   
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		for (int i = 0; i < a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==a[0])
			{
				temp++;
			}
		}
		System.out.println(temp);
	}
}
