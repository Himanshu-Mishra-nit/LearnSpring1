package com.in28munut.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import com.in28minut.junit.MyMath;

class MyMathTest {
	MyMath m = new MyMath();
	
	@Before
	public void before() {
		System.out.println("Before");
	}
	

	@Test
	void sum_with3Numbers() {
		//Absense of failure is success
		//if there is no failure then it is success even if there is no code like here
		
		int result = m.sum(new int[] {1,2,3});
		assertEquals(6, result);

	}

}
