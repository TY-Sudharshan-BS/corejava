package com.tyss.practice.test;

public class AB
{
    {
        System.out.println(1);
    }
}
 
class BC extends AB
{
    {
        System.out.println(2);
    }
}
 
class CD extends BC
{
    {
        System.out.println(3);
    }
}
 
 class TestCD
{
    public static void main(String[] args)
    {
        CD c = new CD();
    }
}
