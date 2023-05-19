package Practice_Program;

class NewEmployee
{
	int Eid;//non-static data member
	String Ename;//non-static data member
	String Department;//non-static data member
	float Salaray; //non-static data member
	static String Company_name="TCS"; //static data member
	
	static int count=0; //variable is count the object
	
	void print()//non static method
	{
	  System.out.println(Eid+" "+Ename+" "+Department+ " "+Salaray+" "+Company_name);
	  count++; //increment
	}
	
}

public class Employees {

	public static void main(String[] args) 
	{
		NewEmployee E1 = new NewEmployee(); //object created
		E1.Eid=101;
		E1.Ename="Raj";
		E1.Department="Manager";
		E1.Salaray= 55000;
		
		NewEmployee E2 = new NewEmployee(); //object created
		E2.Eid=102;
		E2.Ename="Ziya";
		E2.Department="CS";
		E2.Salaray= 45000;
		
		NewEmployee E3 = new NewEmployee(); //object created
		E3.Eid=103;
		E3.Ename="Raj";
		E3.Department="Sales";
		E3.Salaray= 25000;
		
		NewEmployee E4 = new NewEmployee(); //object created
		E4.Eid=104;
		E4.Ename="Raj";
		E4.Department="IT";
		E4.Salaray= 35000;
		
		
		E1.print(); //call method
		E2.print();
		E3.print();
		E4.print();
		System.out.println("The Total number of employees are " +NewEmployee.count + " in this company");
		
	}


	}


