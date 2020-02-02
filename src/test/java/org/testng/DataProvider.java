package org.testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProvider {
   @Parameters({"username","password"})
   @Test
   public void test(String s1,String s2) {
	System.out.println(s1);
	System.out.println(s2);
   }
 @Parameters({"password"})
 @Test
 public void test1 (@Optional("sridhar")String s3) {
	 System.out.println(s3);
	 
 }
}

