package hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class test1 { 
	@Before 
	public void searchmyprofile() {
		System.out.println("my profile is searched successfully");
	} 
	@After 
	public void logout() {
		System.out.println(" logout sucessfully");
	}

}
