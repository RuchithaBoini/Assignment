package com.src;

import java.util.function.DoubleBinaryOperator;

public class LongValuesEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleBinaryOperator db=(o1,o2)->o1-o2;
		System.out.println(db.applyAsDouble(32.456,12.456));

	}

}
