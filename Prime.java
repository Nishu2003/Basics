package Practice;
import java.util.Scanner;

public class Prime {

	  public static void main(String[] args) {
		  Scanner scn=new Scanner(System.in);
				  System.out.println("Please insert any number :  ");
		  
	    int num =scn.nextInt();
	    boolean flag = false;
	    for (int i = 2; i <= num / 2; ++i) {
	      // condition for nonprime number
	      if (num % i == 0) {
	        flag = true;
	        break;
	      }
	    }

	    if (!flag)
	      System.out.println(num + " is prime number.");
	    else
	      System.out.println(num + " is not prime number.");
	  }
	}
