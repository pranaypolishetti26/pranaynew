package com.ppranay.jd;

public class Calculator {
	public int square(int x) {
		return x*x;
	}
	public int sum(int...x) {
		int s=0;
		for(Integer i :x) {
			s+=i;
		}
		return s;
	}
}
