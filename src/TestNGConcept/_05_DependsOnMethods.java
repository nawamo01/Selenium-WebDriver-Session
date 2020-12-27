package TestNGConcept;

import org.testng.annotations.Test;

public class _05_DependsOnMethods {

	
	@Test(priority=1)
	public void logintest() {
		System.out.println("login page");
		int i = 2/0;		// any number divided by zero is Arithmetic exception, so this test case will be failed other 2 tests are skipped 
	}
	
	@Test(dependsOnMethods="logintest")
	public void homepage(){
		System.out.println("Home page");
	}
	
	@Test(dependsOnMethods="logintest")
	public void searchpage(){
		System.out.println("Search page");
	}
	
	
}
