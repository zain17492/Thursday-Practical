/*Create a parent class called "Person" with attributes such as name, age and a method called "speak". 
 * Create a child class called "Student" that inherits from Person and has an additional attribute 
 * called "grade"  and a method called "study". Create an object of the Student class and call
 * both the "speak" and "study" methods.*/
package Practice_Program;

class Person //Parent class
{
	String name; //data member
	int age;
	
	public void speak() //creating method
	{
		System.out.println("This is a speak method of person class");
	}
}

class Student extends Person //child class
{ 
	char grade; //data member
	
	public void study() // creating method
	{
		System.out.println("This is a study method of student class");
	}

}

public class Main_Student  //Main class
{
	public static void main(String[] args) {
		Student s1 = new Student(); //object created
		s1.name ="Zainab"; // assigning value
		s1.age = 23;
		s1.grade= 'A';
		s1.speak(); //calling method
		s1.study(); //calling method
	}

}
