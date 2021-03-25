package com.tyss.practice.test;

public class Boy {
	 String s = "Class A";
}

class Girl extends Boy
{
    String s = "Class B";
 
    {
        System.out.println(super.s);
    }
}

class Man extends Girl
{
    String s = "Class C";
 
    {
        System.out.println(super.s);
    }
}

 class Person
{
    public static void main(String[] args)
    {
        Man c = new Man();
 
        System.out.println(c.s);
    }
}