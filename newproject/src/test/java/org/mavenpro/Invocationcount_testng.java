package org.mavenpro;

import org.testng.annotations.Test;

public class Invocationcount_testng {
	@Test(invocationCount=5,timeOut=1000)
	public void hi() {
		System.out.println("Hi");
	}
}
