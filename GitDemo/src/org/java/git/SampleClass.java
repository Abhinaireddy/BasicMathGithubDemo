package org.java.git;

public class SampleClass {
	int a = 2;
	int b = 5;

	public void sum() {
		int c = a + b;
		System.out.println(c);
	}
	public void sub() {
		int c = a - b;
		System.out.println(c);
	}

	public void mul() {
		int c = a * b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SampleClass s = new SampleClass();
		s.sum();
		s.mul();
	}

}
