package exp.java8.methref.staticmethod;

public class Exp2Class2 {

	/*
	 * Predefined functional interface Runnable to refer static method.
	 */
	
	public static void saySomething()
	{
		System.out.println("From  the method reference class saySomething()");
	}
	
	public static void main(String[] args) {
		
		Thread thread = new Thread(Exp2Class2::saySomething);
		thread.start();

	}

}
