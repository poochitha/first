package org.pracjunit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Junit {
	@BeforeClass
	
	public static void beforeClass() {
		// TODO Auto-generated method stub
		System.out.println("Before class");
	}
	
	@Before
	
	public void before() {
		// TODO Auto-generated method stub
		System.out.println("Before");
	}
	
	@Test
	
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("Test");
	}
	
	@Test
	
	public void test1() {
		// TODO Auto-generated method stub
		System.out.println("Test 1");
	}
	
	@Test
	
	public void test2() {
		// TODO Auto-generated method stub
		System.out.println("Test 2");
	}
	
	@After
	
	public void after() {
		// TODO Auto-generated method stub
		System.out.println("After");
	}
	
	@AfterClass
	
	public static void afterClass() {
		// TODO Auto-generated method stub
		System.out.println("After Class");
	}
	
	
	
	
	

}
