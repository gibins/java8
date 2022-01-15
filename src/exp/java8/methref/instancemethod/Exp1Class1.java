package exp.java8.methref.instancemethod;

public class Exp1Class1 {
	
	public void saySomething()
	{
		System.out.println("From Exp1Class1 saySomething()");
	}

	public static void main(String[] args) 
	{
		//instance variable
		
		Exp1Class1 exp1Class1 = new Exp1Class1();
		
		//instance reference connectd to the interface
		Exp1Iface1 exp1Iface1 = exp1Class1::saySomething;
		
		//this will invoke the static method saySomething()
		exp1Iface1.say();
		
		

	}

}
