package TestNGConcept_RetryLogic;


import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest {
	
@Test	
	public void test1() {
		Assert.assertEquals("Google", "google123");
	}

@Test
	public void test2() {
		Assert.assertEquals("Facebook", "Yahoo");
	}
	
}
