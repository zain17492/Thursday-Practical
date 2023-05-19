/*Write a program to print the names of students by creating a student class.If no name is passed while 
 * creating an object of Student class, then the name should be "Unknown",
 * otherwise the name should be equal to the String value passed while creating object of student class*/
package Practice_Program;

public class StudentExample 
{
      private String Name;
      
      public StudentExample()//Create No-Agrs Constructor
      {
    	  this.Name="Unknown";
      }
      
	public StudentExample(String name) // Create Parameterized Constructor 
	{
		super();
		Name = name;
	}
	
	public String getName()
	{
		return Name;
	}

	

	public static void main(String[] args) 
	{
		StudentExample s1 = new StudentExample();
		StudentExample s2 = new StudentExample("Zain");
		StudentExample s3 = new StudentExample("Zainab");
		
		System.out.println(s1.getName());
		System.out.println(s2.getName());
		System.out.println(s3.getName());
		
	}

}
