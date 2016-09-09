import java.util.Scanner;

class Primenumber {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp=0;
		for(int i=2;i<r;i++)
		{
			int temp1=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
					temp1=1;
			}
			if(f==0)
			{
				//System.out.print(i+" ");
				temp=temp+i;
			}
		}
		System.out.println("total= "+temp);
	}
}
