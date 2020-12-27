package TestNGConcept;

import org.testng.annotations.Test;

public class _08_ExpectedExpectations {

	@Test(expectedExceptions=NumberFormatException.class)
	public void exceptions() {
		String x = "100A";
		Integer.parseInt(x);
		
		
	}	
	
}
