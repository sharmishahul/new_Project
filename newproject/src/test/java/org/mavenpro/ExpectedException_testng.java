package org.mavenpro;

import org.testng.annotations.Test;

public class ExpectedException_testng {
	@Test(expectedExceptions=ArithmeticException.class)
public void divbyzero() {
	int i=10/0;
}
	@Test
public void divbyzero1() {
	int i=10/0;
}
}
