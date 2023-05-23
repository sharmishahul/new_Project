package org.mavenpro;

import org.testng.annotations.Test;

public class Dependencytestng {
	@Test
	public void hi() {
		System.out.println("Hi");
	}
	@Test(dependsOnMethods= {"testngpractice"})
	public void thisis() {
		System.out.println("This Is");
	}
	@Test
	public void testngpractice() {
		System.out.println("TestNG Practice");
	}
}
