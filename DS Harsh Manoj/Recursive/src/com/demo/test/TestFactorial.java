package com.demo.test;

public class TestFactorial {

	public static void main(String[] args) {
		int n=Factorial(5);
		System.out.println("(Normal Way)Factorial is:"+n);
		
		int a=RecursiveFactorial(5);
		System.out.println("(Recursive Way)Factorial is:"+a);
	}

	private static int RecursiveFactorial(int n) {
		for(int i=0;i<n;i++) {
			if(n==1)
				return 1;
		}
		return n* RecursiveFactorial(n-1);
	}

	private static int Factorial(int n) {
		int fact=1;
		for(int i=1;i<=n;i++){
			fact=fact*i;
		}
		return fact;
	}

}
