/*Create a parent class called "Person" with attributes such as name, age and a method called "speak". 
 * Create a child class called "Student" that inherits from Person and has an additional attribute 
 * called "grade"  and a method called "study". Create an object of the Student class and call
 * both the "speak" and "study" methods.*/
package Practice_Program;

class Person //Parent class
{
	String name; //data member
	int age;
	
	 public Person(String name, int age) 
	 {
		this.name = name;
		this.age = age;
	}

	void speak() //creating method
	{
		System.out.println("This is a speak method of person class");
		System.out.println("The name of person is:- " +name);
		System.out.println("The age of person is:- " +age);
	}
}

class Student extends Person //child class
{ 
	char grade; //data member
	
	public Student(String name, int age, char grade) 
	{
		super(name, age);
		this.grade = grade;
	}

    void study() // creating method
	{
		System.out.println("This is a study method of student class");
		System.out.println("The grade of student is :- " +grade);
	}

}

public class Main_Student  //Main class
{
	public static void main(String[] args) {
		Student s1 = new Student("Zainab", 22, 'A'); //object created
		s1.speak(); //calling method
		s1.study(); //calling method
	}

}
