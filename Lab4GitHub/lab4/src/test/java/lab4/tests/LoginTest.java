package lab4.tests;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import lab4.pages.loginpage;

public class LoginTest {
	WebDriver driver;
	loginpage loginpage;
	
	@Before
	public void setUp() {
		
		loginpage = new loginpage(driver);
		driver = loginpage.chromeDriverConnection();
		driver.manage().window().maximize();
		loginpage.visit("https://phptravels.net/login");
	}
	@After
	public void tearDown() {
		driver.quit();
	}
	
	 @Test
	    public void testLoginSuccess() throws InterruptedException {
	        loginpage.login("user@phptravels.com", "demouser"); 
			Thread.sleep(2500);
	        assertTrue(loginpage.logged());
	    }
	 
	 @Test
	    public void testLoginEmpty() throws InterruptedException {
	        loginpage.login("",""); 
			Thread.sleep(2500);
	        assertFalse(loginpage.logged());
	    }
	 
	 
	 @Test
	    public void testLoginWrongData() throws InterruptedException {
	        loginpage.login("user@phptravels.com", "demozuna"); 
			Thread.sleep(2500);
	        assertFalse(loginpage.logged());
	    }
	 
	 
	 


	
}
	
