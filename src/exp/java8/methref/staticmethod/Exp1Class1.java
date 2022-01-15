package exp.java8.methref.staticmethod;

public class Exp1Class1 {
	
	//static method
	public static void saySomething()
	{
		System.out.println("From the method reference class saySomething()");
		//say();
	}

	//static method
	/*
	 * public static void say() {
	 * System.out.println("From the method reference class say()"); }
	 */
	public static void main(String[] args) {
		
		//static method reference
		Exp1Iface exp1Iface = Exp1Class1::saySomething;
		
		//invoke interface method
		
		/*
		 * 
		 * Here no error happens
		 * 
		 * Interface can be used to reference a static block
		 */
		exp1Iface.say();

	}

}
