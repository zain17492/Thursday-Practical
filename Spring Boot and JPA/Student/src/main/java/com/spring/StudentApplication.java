package com.spring;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring.entity.Stud;
import com.spring.repo.Studrepo;

@SpringBootApplication
public class StudentApplication
{
	public static void main(String[] args) 
	{
		//ApringApplication return Application
		ApplicationContext con=SpringApplication.run(StudentApplication.class, args);
		
		//Getting stud
		Studrepo sr =con.getBean(Studrepo.class);
		
		Stud s1,s2,s3;
		s1=new Stud();
		s1.setSid(101);
		s1.setSname("Zain");
		s1.setMarks(98);
		
		s2=new Stud();
		s2.setSid(102);
		s2.setSname("Vaibhavi");
		s2.setMarks(78);
		
		s3=new Stud();
		s3.setSid(103);
		s3.setSname("Vaibhavi");
		s3.setMarks(88);
		
		Stud st1,st2,st3;
		st1 =sr.save(s1);
		st2=sr.save(s2);
		st3=sr.save(s3);
		
		
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);
		
		List<Stud> li=List.of(s1,s2,s3);
		
		Iterator<Stud> itr=sr.saveAll(li).iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		sr.saveAll(li).forEach(obj ->System.out.println(obj));
		
		//Updating values
		Optional<Stud> op=sr.findById(103);
		Stud st4=op.get();
		st4.setSname("Sameera");
		
		//getting all data from database
		Iterator<Stud> itr1=sr.findAll().iterator();
		while (itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		sr.findAll().forEach(obj1->System.out.println(obj1));
			
		
		//deleting data from database
		sr.deleteById(102);
		System.out.println("Deleted data");

}
}
