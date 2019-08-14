package com.zensar.module;

public class Arithmatic {
	private Calculator calculator;
	
	public Arithmatic() {
		// TODO Auto-generated constructor stub
	}

	public Arithmatic(Calculator calculator) {
		super();
		this.calculator = calculator;
	}
	
	public int doAddition(int x, int y) {
		return calculator.add(x, y);
	}
}	
