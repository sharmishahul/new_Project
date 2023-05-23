package org.listener;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(org.listener.Listenerclass.class)
public class Failtest {
	@Test(successPercentage=60)
	public void divbyzero1() {
		int i=10/0;
	}
}
