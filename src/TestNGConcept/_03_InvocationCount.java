package TestNGConcept;

import org.testng.annotations.Test;

public class _03_InvocationCount {

	@Test(invocationCount = 10)
	public void Sum(){
		int a = 5;
		int b = 5;
		int c = a+b;
		System.out.println("The Sum Value is == "+c);
	}
	
}
