package TestNGConcept;

import org.testng.annotations.Test;

public class _06_InvocationTimeout {

	//creating infinate loop
	@Test(priority=1, timeOut = 2000)
	public void loop() {
		int i =1;
		while(i<2) {
			System.out.println(i);
		}
	}
	
	
	@Test(priority = 2, invocationTimeOut = 2000)
	public void loop1() {
		int j = 2;
		while(j<3) {
			System.out.println(j);
		}
	}
}
