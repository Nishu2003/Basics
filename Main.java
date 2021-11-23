//Write a program for matrix addition and matrix multiplication.

import java.util.Scanner;  // importing scanner calss --- for taking input from the user 
//Main class
public class Main
{
	public static void main(String[] args) {
	    Scanner scn=new Scanner (System.in);  // scanner class object -- scn
	    int p,q;
	    int m=0;
	    int n=0;
	    System.out.println();
	    System.out.println("******************** FOR 2-D ARRAY ***********************");
		System.out.println("Enter the no of rows and columns in array 1 : ");
		p=scn.nextInt(); 
		q=scn.nextInt();
		
		
		System.out.println("The no of rows and columns in array 2 is : " + p + " and " + q);
		
		
		int arr[][]=new int [p][q];
		int ar[][]=new int[p][q];
		System.out.println();
		
		//input the elements of first array
		System.out.println("Enter the first array elements : " );
		for(int i=0;i<p;i++){
		    for(int j=0;j<q;j++){
		        System.out.print("arr["+i+"]["+j+"]" + " : ");
		        arr[i][j]=scn.nextInt();
		    }
		}
		System.out.println();
		
		//input the elements of second array
		System.out.println("Enter the Second array elements : " );
		for(int i=0;i<p;i++){
		    for(int j=0;j<q;j++){
		        System.out.print("arr["+i+"]["+j+"]" + " : ");
		        ar[i][j]=scn.nextInt();
		    }
		}
		System.out.println();
		
		// taking user's choice to enter the choice for ADDITION or 
		// MULTIPLICATION respectively
		System.out.println("*********************************************");
		int ch;
		System.out.println("Enter your choice : ");
		System.out.println("1 -- MATRIX  ADDITION " );
		System.out.println("2 -- MATRIX  MULTIPLICATION");
		System.out.println("Your choice : ");
		ch=scn.nextInt();
		System.out.println();
		
		/************************ SWITCH CASE ***********************/
		switch(ch){
		    case 1:   //if the user wants to perform matrix addition
		        
		        //printing the array 1 before addition
		        System.out.print("Array 1 before addition : ");
		        for(int i=0;i<p;i++){
		      for(int j=0;j<q;j++){
		          System.out.print(arr[i][j] + "  ");
		    }
		}
		System.out.println();
		
		// printing the Array 2 before addition
		System.out.print("Array 2 before addition : ");
		        for(int i=0;i<p;i++){
		      for(int j=0;j<q;j++){
		          System.out.print(ar[i][j] + "  ");
		    }
		}
		System.out.println();
		
		// Array after addition
		System.out.print("Array after addition : ");
		        for(int i=0;i<p;i++){
		      for(int j=0;j<q;j++){
		          m=ar[i][j]+arr[i][j];
		          System.out.print(m + "  ");
		          
		    }
		}
		        break;
		        
		        case 2:   // if the user wants to perform multiplication
		        
		        // printing Array 1 before multiplication
		             System.out.print("Array 1 before multiplication : ");
		        for(int i=0;i<p;i++){
		      for(int j=0;j<q;j++){
		          System.out.print(arr[i][j] + "  ");
		    }
		}
		System.out.println();
		
		// printing Array 2 before multiplication
		System.out.print("Array 2 before multiplication : ");
		        for(int i=0;i<p;i++){
		      for(int j=0;j<q;j++){
		          System.out.print(ar[i][j] + "  ");
		    }
		}
		System.out.println();
		
		// printing Array after multiplication
		System.out.print("Array after multiplication : ");
		        for(int i=0;i<p;i++){
		      for(int j=0;j<q;j++){
		          n=ar[i][j] * arr[i][j];
		          System.out.print(n + "  ");
		          
		    }
		}
		            break;
		            
		            default:   // for invalid choice
		                System.out.println("INVALID CHOICE ");
		}
	
	}
}
