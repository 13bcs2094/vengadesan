package pro;

import java.util.Scanner;

public class decrease {
        public static void main(String[] args) 
        {
			Scanner sc=new Scanner(System.in);
			int x=sc.nextInt();
			int y=sc.nextInt();
			int i=0;
			int u=x;
			int a[]=new int[100];
			while(x>0)
			{
				a[i]=x%10;
				x=x/10;
				i++;
			}
			int temp=1;
			for (int j = 0; j <i; j++)
			{
				temp=temp*a[j];
			}
			//System.out.println(temp);
             int o=u*temp;
             if(y==o)
             {
            	 System.out.println("It is a seed of y");
             }
             else 
             {
            	 System.out.println(" It is not a seed of y");
             }
		}
}

