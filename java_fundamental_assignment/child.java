package accolite.java_fundamental_assignment;

public class child extends parent {
	
	public String name;
		void sum(int a,int b)
	{
		System.out.println("overload example with two argument and sum of 10 and 20 is "+(a+b));
		
	}
	
	void sum(int a,int b,int c)
	{
		System.out.println("overload example with three argument and sum of 10 ,20 and 30 is"+(a+b+c));
	}
	child(int i,String name)
	{
		super(i);
		this.name=name;
		System.out.println("Child constructor is called");

	}
	
	


}
