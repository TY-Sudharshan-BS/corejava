package com.tyss.constructor.test;
import com.tyss.constructor.overloading.*;

public class TestPerson extends Demo {
public static void main(String[] args) {
	Person p = new Person();
	System.out.println(p.name);
	System.out.println(p.sal);
	
	TestPerson t = new TestPerson();
	t.disp();
	
	
	
}
}
