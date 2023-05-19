package Practice_Program;

import java.util.HashMap;
import java.util.Map;

class StudentM
{
	int id;
	String name;
	
	 StudentM(int id, String name) 
	 {
		this.id = id;
		this.name = name;
	}
}

public class StudentUsingMaps
{

	public static void main(String[] args) {
	   StudentM s1= new StudentM(101, "Adnan");
	   StudentM s2= new StudentM(102, "Zainab");
	   StudentM s3= new StudentM(103, "Azain");
	   StudentM s4= new StudentM(104, "Adi");
	   StudentM s5= new StudentM(105, "Zain");
	   StudentM s6= new StudentM(106, "Zoya");
	   Map<Integer, StudentM> m = new HashMap<Integer,StudentM>();
	   m.put(1, s1);
	   m.put(2, s2);
	   m.put(3, s3);
	   m.put(4, s4);
	   m.put(5, s5);
	   m.put(6, s6);
	   
	   //printing the data
	   for(Map.Entry<Integer, StudentM> e:m.entrySet())
	   {
		   int key =e.getKey();
		   StudentM s=e.getValue();
		   System.out.println(key+" "+s.id+ " "+s.name);
	   }
	}

}
