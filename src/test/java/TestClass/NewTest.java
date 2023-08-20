package TestClass;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTest {
	
	  @BeforeClass
	  public void beforeClass() {
	  }
	  
	  @BeforeMethod
	  public void beforeMethod() {
	  }

	  @Test
	  public void LoginPage() {
	  }
	
	  @AfterMethod
	  public void afterMethod() {
	  }
	
	
	
	  @AfterClass
	  public void afterClass() {
	  }

}
