package org.mavenpro;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {
int testCount=0;
int limit =5;
public boolean retry(ITestResult result) {
	if(testCount<limit) {
		testCount++;
		return true;
	}
	return false;
}
}
