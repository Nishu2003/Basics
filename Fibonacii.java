package Practice;
import java.util.Scanner;
//FIBONACII SERIES USING  RECURSION
public class Fibonacii {
	int n;
	int fib (int n) {
		if (n==0)
			return 0;
		if(n==1)
			return 1;
		else
			return (fib(n-1)+fib(n-2));
	}

	public static void main(String args[]) {
		Fibonacii x=new Fibonacii();
		Scanner sc=new Scanner(System .in);
		System.out.println("Enter the number upto which you want to calculate the Fibonacii Series : ");
		x.n=sc.nextInt();
		System.out.println("The Fibonacii series upto " + x.n + " is : " );
		for(int i=0;i<x.n;i++) {
			System.out .println(x.fib(i));
		}
	}
}
