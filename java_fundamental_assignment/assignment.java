package accolite.java_fundamental_assignment;
//java program to show use of
// 1:inheritance
// 2:static block
// 3:abstract class
// 4:interface
// 5:override
// 6:overloading
// 7:this

public class assignment {
	public static void main(String args[])
	{
		
		System.out.println("Hello from main function");
		child obj=new child(19,"Akash");
		obj.sum(10, 20);
		obj.sum(10, 20,30);
		
		test.function(); //method called without creating object of class test
	
		abstract_derived obj1=new abstract_derived(); //object to show abstract class in java
		obj1.fun();
	
		interface_class obj3=new interface_class();
		obj3.interface_function1();
		obj3.interface_function1();
		
		static_block obj4=new static_block();
		
		//block of code to show exception handling in java
		
		String name=null;
		try {
			System.out.println(name.length());
		}
		
		catch(NullPointerException  ob){
			System.out.println("Exception caught"+ob);
			}
	
		System.out.println("After catching the error .. rest of code");
	}
	
	static {
		System.out.println("Hello before main from static block");
	}
}


//class to show abstract class in java
abstract class abs_test{
	abstract void fun();
	
}


class abstract_derived extends abs_test{
	
	void fun() {
		System.out.println("abstract function called");
	}
}


class test{
	
public static void function() {
	System.out.println("Static method called");
}
}

//class to check static block in java
class static_block{
	
	static int i;
	static {
		i=10;
		System.out.println("static block called ");
	}
	static_block(){
		System.out.println("constructor of static_block class called");
	}
	
}




//parent class for inheritance
class parent{
	 public int var1;
	parent(int i){
	
		this.var1=i;
		System.out.println("super called Parent constructor is called");
	}
	
	void show() {
		System.out.println("Parent class method  is called and number is "+this.var1);
		
	}
}


//class to show interface in java

interface interface_example{
	
void interface_function1();
void interface_function2();
	
}

class interface_class implements interface_example{
	@Override
	public void interface_function1() {
		System.out.println("first method of class implementing interface called");
	}
	@Override
	public void interface_function2() {
		System.out.println("first method of class implementing interface called");
	}
	
	
}



