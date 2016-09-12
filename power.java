import java.util.Scanner;

public class power {
	              
		       public static void main(String args[])
		       {
		    	   Scanner sc=new Scanner(System.in);
		    	   int n=sc.nextInt();
		    	   int a[]=new int[1000];
		    	   int i=0,sum=0,product=0;
		    	   while(n>0)
		       {
		    		a[i]=n%10;
		    		//System.out.print(a[i]);
		    		n=n/10;
		    		i++;   
		       }
		    	  // System.out.println(i);
		    	   for(int j=0;j<i;j++)
		    	   {
		    		sum=(int) Math.pow(a[j],i)+1;
		    		product=product+sum;
		    	   }
		    	   
		    	 System.out.println(product);
	}
	}

