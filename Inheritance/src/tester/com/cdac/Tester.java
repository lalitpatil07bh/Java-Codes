package tester.com.cdac;

import java.util.Scanner;

import Inheritance.com.cdac.Facuilty;
import Inheritance.com.cdac.Student;

public class Tester {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter facuilty details String fn,String ln,int exp,String field");
		Facuilty f1=new Facuilty(sc.next(), sc.next(), sc.nextInt(),sc.next());
		System.out.println(f1.getDetails());
		
		System.out.println();
		
		System.out.println("Enter Student Details String fn,String ln,int gradyear,String course,int marks");
		Student s1=new Student(sc.next(), sc.next(), sc.nextInt(),sc.next(),sc.nextInt());
		System.out.println(s1.getDetails());


	}

}
