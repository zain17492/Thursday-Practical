package Practice_Program;

class Teacher
{
  int tid;
  String tname;
  String gender;
  String subject;
  String department;
  float salary;
  void getData(int id, String name, String gender, String subject, String department, float salary)
   {
	  this.tid=id;
	  this.tname=name;
	  this.gender=gender;
	  this.subject=subject;
	  this.department=department;
	  this.salary=salary;
   }
   void displayData()
   {
	   System.out.println("ID:" +tid+ "\n Name:" +tname+ "\n Gender:" +gender+ "\n Subject:" +subject+ 
	                      "\n Department:" +department+  "\n Salary:" +salary);
   }    
}

public class Main_Teacher 
{
	public static void main(String args[])
	{
		Teacher t1= new Teacher();
		t1.getData(102, "Zain", "Female", "OOPS", "IT", 25000);
		t1.displayData();
	}

}
