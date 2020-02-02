package org.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTest {
	@BeforeSuite
	public void beforesuite() {
		System.out.println("before suite");

	}
	@AfterSuite
	public void aftersuite() {
		System.out.println("After suite");

	}
	@BeforeClass
	public void beforeclass() {
		System.out.println("before class");

	}
	@AfterClass
	public void afterclass() {
		System.out.println("after class");

	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("before method");

	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("after method");

	}
	@BeforeTest
	public void beforetest() {
		System.out.println("before test");
	}
	@AfterTest
	public void aftertest() {
		System.out.println("after test");

	}
	@Test
	public void test() {
		System.out.println("Test");

	}
	
	

}
