package exp.java8.methref.staticmethod;

import java.util.function.BiFunction;

public class Exp4Class2 {

	
	public static void main(String[] args)
	{
	
		/*
		 * Mapping over loaded static method reference
		 */
		BiFunction<Integer, Integer, Integer> intBiFun = Exp4Class1::add;
		BiFunction<Float, Float, Float> floatBiFun = Exp4Class1::add;
		BiFunction<Long, Long, Long> longBiFun = Exp4Class1::add;
		
		System.out.println(" Result int "+intBiFun.apply(10, 5));
		System.out.println(" Result float "+floatBiFun.apply(10.2f, 5.0f));
		System.out.println(" Result long "+longBiFun.apply(10l, 5l));
		
		
		
	}
	
	
}
