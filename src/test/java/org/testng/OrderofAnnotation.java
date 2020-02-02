package org.testng;

import org.testng.annotations.Test;

public class OrderofAnnotation {
	@Test(priority=10)
	public void test0() {
		System.out.println("test0");

	}
	@Test(priority=5)
	public void Test1() {
		System.out.println("Test1");

	}
	@Test(priority=-10)
	public void test2() {
		System.out.println("test2");

	}
	@Test(enabled=false)
	public void test3() {
		System.out.println("test3");

	}
	@Test
	public void test4() {
		System.out.println("test4");

	}

}
