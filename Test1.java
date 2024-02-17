package com.test;

import org.testng.annotations.Test;

public class Test1 {
	
	@Test
	public void test1() {
		
		System.out.println("my first test case");
		
		
	}
	@Test
	public void test2() {
		
		System.out.println("my first test case");
		
		
	}
	
	
	@Test(groups= {"Smoke"})
	public void crp() {
		
		System.out.println("I an from Test1 grp class");
		
		
	}
	
	

}
