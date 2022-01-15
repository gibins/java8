package exp.java8.methref.staticmethod;

import java.util.function.BiFunction;

public class Exp3Class2 {

	public static void main(String[] args) 
	{
		BiFunction<Integer, Integer, Integer> biFun= Exp3Class1::say;
		int result = biFun.apply(10, 5);
		
		System.out.println("Result "+result);

	}

}
