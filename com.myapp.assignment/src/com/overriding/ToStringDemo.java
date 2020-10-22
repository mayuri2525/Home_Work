package com.overriding;

class Student
{
	Student(String t){
		
	}
	@Override
	public String toString() {
		return "the taste of india";
	}
}
public class ToStringDemo { 
	
	public static void main(String args[]) {
		Object obj=new Object();
		System.out.println(obj.toString());
		Student student =new Student("xyz");
		System.out.println(student.toString());
		
		String temp=new String("fxghj");
		System.out.println(temp.toString());
		
		
	}

}
