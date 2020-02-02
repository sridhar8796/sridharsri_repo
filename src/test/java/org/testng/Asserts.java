package org.testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Asserts {
	@Test
	public void username() {
		Assert.assertTrue(true);
		Assert.assertTrue(false);
		Assert.assertTrue(true);
		

	}
	@Test
	public void password() {
		SoftAssert s= new SoftAssert();
		s.assertTrue(true);
		s.assertTrue(false);
		s.assertTrue(true);

	}
	@Test
	public void firstname() {
		Assert.assertTrue(true);
		Assert.assertTrue(true);
	}
	@Test
	public void lastname() {
		SoftAssert s= new SoftAssert();
		s.assertTrue(true);
		s.assertTrue(false);
		s.assertTrue(true);
		//s.assertAll();
	}

}
