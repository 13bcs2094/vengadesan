
	import java.util.Scanner;

	public class v1 {

	    private static Scanner input;

		public static void main(String[] args) { 

	        input = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int number = input.nextInt();

	        if(number>=0) 
	            System.out.println("Number is natural and positive.");
	            else 
	            System.out.println("Number is negative.");
	    }
	}

