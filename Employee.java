package Practice;

class emp1{
	//VARIAVBLES FOR EMPLOYEES
	public String name;
	public int year_of_joining;
	public int salary;
	public String address;
	
	
	//FOR EMPLOYEE 1
	void print_data1() {
		name ="Robert";
		year_of_joining = 1994;
		salary = 6400000;
		address= "64C-Walls Street";
	    
		System.out.println("Name : "+name);
		System.out.println("Year of Joining : "+year_of_joining);
		System.out.println("Salary : $ "+salary);
		System.out.println("Address :  "+address);
	}
	
	//FOR EMPLOYEE 2
	void print_data2() {
		name ="Sam";
		year_of_joining = 20000;
		salary = 6900000;
		address= "68-D-Walls Street";
	    
		System.out.println("Name : "+name);
		System.out.println("Year of Joining : "+year_of_joining);
		System.out.println("Salary : $ "+salary);
		System.out.println("Address :  "+address);
	}
	
	//FOR EMPLOYEE 3
	void print_data3() {
		name ="John";
		year_of_joining = 1999;
		salary = 2400000;
		address= "26-B-Walls Street";
	    
		System.out.println("Name : "+name);
		System.out.println("Year of Joining : "+year_of_joining);
		System.out.println("Salary : $ "+salary);
		System.out.println("Address : "+address);
	}
}

//MAIN CLASS Employee
public class Employee {
	public static void main(String args[]) {
		
		//OBJECT OF emp1 CLASS
		emp1 a=new emp1();
		
		//CALLING pirnt_data1 of emp1 class using the object of emp1 class
		a.print_data1();
		System.out.println();
		
		//CALLING pirnt_data2 of emp1 class using the object of emp1 class
		a.print_data2();
		System.out.println();

		//CALLING pirnt_data3 of emp1 class using the object of emp1 class
		a.print_data3();
		System.out.println();
	}

}
