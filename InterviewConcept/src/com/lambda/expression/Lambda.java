package com.lambda.expression;

@FunctionalInterface
interface Functional{
	public int add(int a, int b);
}

public class Lambda {
	public static void main(String[] args) {
		Functional f = (a, b) -> (a+b);
		System.out.println(f.add(10, 20));
		
	}
}
