package assignment;
import java.util.Scanner;
	
	
	public class Main 
	{
		Scanner sc = new Scanner(System.in);
	          
	
	//function to checkPalindrome
	       public void checkPalindrome()  
	       {
	    	   System.out.println("Enter the number to check for palindrome");
	    	   int num=sc.nextInt();
	    	   int mod,newnum=0,basic=num;
		   		while(num>0)
		   		{
		   			mod=num%10;
		   		    newnum=(newnum*10)+mod;
		   		    num=num/10;   
		   		}
		   		if(newnum==basic)
		   			System.out.println("the number is palindrome");
		   		else
		   			System.out.println("the number entered is not palindrome");

	      }
	       
	       
	    //function to printPattern
	       public void printPattern() 
	       {
	    	   System.out.println("enter the size for the pattern of stars");
	    	   int size=sc.nextInt();
	    	   for(int i=size;i>0;i--)
	   		{
	   			for(int j=0;j<i;j++)
	   				{System.out.print("*");}
	   			System.out.println();
	   		}
	       }
	       


	    //function to check no is prime or not
	        public void checkPrimeNumber() 
	        {
	        	System.out.println("enter the number to check for prime");
	    		int num=sc.nextInt();
	        	int count=0;
	    		for(int i=1;i<num/2;i++)
	    		{
	    			if(num%i==0)
	    			{
	    				++count;
	    			}
	    			else
	    				continue;
	    		}
	    		if(count==1)
	    			System.out.println("prime number");
	    		else
	    			System.out.println("not a prime number");

	        }

	         

	     // function to print Fibonacci Series
	          public void printFibonacciSeries() 
	          {
	        	  System.out.println("enter the size for the fibonacci series");
	           		int size=sc.nextInt();
	                //initialize the first and second value as 0,1 respectively.

	           int first = 0, second = 1;
	           int next;
		   		System.out.print(first);
		   		System.out.print(" " +second + " ");
		   		for(int i=0;i<size-2;i++)
		   		{
		   			next=first+second;
		   			first=second;
		   			second=next;
		   			System.out.print(next+ "  ");
		   		}

	          System.out.println();
	          }

	 

	//main method which contains switch and do while loop
	      public static void main(String[] args) 
	      {
	                Main obj = new Main();
	                int choice;
	                Scanner sc = new Scanner(System.in);

	do {

	System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

	+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

	+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

	System.out.println();
	choice = sc.nextInt();
	
	
	switch (choice) 
	{

		case 0:
			choice = 0;
			break;
	case 1: 
		{
		obj.checkPalindrome();
		}
			break;
	case 2: 
		{
			obj.printPattern();
		}
			break;
	case 3:
		{
			obj.checkPrimeNumber();
		}
			break;
	 case 4: 
	{
		obj.printFibonacciSeries();
	}
			break;
	default:
		System.out.println("Invalid choice. Enter a valid no.\n");
		}
	} while (choice != 0);

	
	
	System.out.println("Exited Successfully!!!");
	sc.close();
	      }

}