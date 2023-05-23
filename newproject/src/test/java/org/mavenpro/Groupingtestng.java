package org.mavenpro;

import org.testng.annotations.Test;

public class Groupingtestng {
	@Test(groups= {"bike"})
	public void royalenfield() {
		System.out.println("royalenfield");
	}
	@Test(groups= {"bike"})
	public void yamaha() {
		System.out.println("yamaha");
	}
	@Test(groups= {"bike"})
	public void duke () {
		System.out.println("duke");
	}
	@Test
	public void benz() {
		System.out.println("benz");
	}
	@Test
	public void swift() {
		System.out.println("swift");
	}
	@Test
	public void mahindra() {
		System.out.println("mahindra");
	}

}
