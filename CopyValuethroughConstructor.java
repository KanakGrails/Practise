package com.practice.deleteit.later;

public class CopyValuethroughConstructor {

	String name;
	int age;
	
	CopyValuethroughConstructor(String name, int age)
	{
		this.name=name;
		this.age=age;
	}
	CopyValuethroughConstructor(CopyValuethroughConstructor obj)
	{
		this.name=obj.name;
		this.age=obj.age;
		
	}
	CopyValuethroughConstructor(){}
	
	public static void main(String[] args) {
		CopyValuethroughConstructor obj1= new CopyValuethroughConstructor("Kanak", 29);
		CopyValuethroughConstructor obj2= new CopyValuethroughConstructor(obj1);
		CopyValuethroughConstructor obj3= new CopyValuethroughConstructor();
		
		System.out.println("obj1.name == "+obj1.name+" obj1.age == "+obj1.age);
		System.out.println("obj2.name == "+obj2.name+" obj2.age == "+obj2.age);
		
		obj3=obj2;

		System.out.println("obj3.name == "+obj3.name+" obj3.age == "+obj3.age);
	}

}
