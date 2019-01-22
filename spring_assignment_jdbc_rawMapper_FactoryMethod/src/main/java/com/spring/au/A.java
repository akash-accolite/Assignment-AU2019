package com.spring.au;
//Class to show the functionality of factory method
public class A {  
	
private static final A obj=new A();  

private A(){System.out.println("from private constructor");}  

//This method will be called by the factory method
public static A getA(){  
    System.out.println("Now factory method is called");  
    return obj;  
}
}  
