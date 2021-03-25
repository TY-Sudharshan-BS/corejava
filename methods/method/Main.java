package com.tyss.basic.method;

public class Main {
	  public static void main(String[] args) {
	    
	    // using the sqrt() method
	    System.out.print("Square root of 4 is: " + Math.sqrt(4));
	  }
	}

	//Static Inner Class

	class TestOuter1{  
	  static int data=30;  
	  static class Inner{  
	   void msg(){System.out.println("data is "+data);}  
	  }  
	  public static void main(String args[]){  
	  TestOuter1.Inner obj=new TestOuter1.Inner();  
	  obj.msg();  
	  }  
	}