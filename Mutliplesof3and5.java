package com.src;

import java.util.function.IntFunction;

public class Mutliplesof3and5 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		IntFunction mul3and5=(o1)->{if(o1%3==0 && o1%5==0) {
			System.out.println("FizzBuzz");
		} else if(o1%5==0) {
			System.out.println("Buzz");
		}else if (o1%3==0) {
			System.out.println("Fizz");
		}else {
			System.out.println("give another input ");
		}
		return o1;
		};
		mul3and5.apply(15);
	}
}
		/*IntFunction mul5=(o1)->{if(o1%5==0) {
			System.out.println("Buzz");
		}
		return o1;
		};
		IntFunction mul3and5=(o1)->{if(o1%3==0 && o1%5==0) {
			System.out.println("FizzBuzz");
		}
		return o1;
		};
		
		mul3.apply(9);
		mul5.apply*/

	


