package org.mavenpro;

import org.testng.annotations.Test;

public class Retryanalyzer_testng {
	
		@Test(retryAnalyzer=Retry.class)
	public void divbyzero1() {
		int i=10/0;
	}
}
