package com.tyss.staticandnonstatic.static1;

public class TestMain {
public static void main(String[] args) {
	TestNonStatic t =new TestNonStatic();
	t.degree = "BE";
	System.out.println("age of emp is "+ t.age);
	System.out.println("degree of emp is "+t.degree);
	System.out.println("marks of emp is "+t.marks);
	t.designation();
	
}
}
