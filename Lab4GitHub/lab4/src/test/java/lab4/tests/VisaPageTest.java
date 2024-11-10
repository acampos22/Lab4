package lab4.tests;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import lab4.pages.VisaPage
;

public class VisaPageTest {
	WebDriver driver;
	VisaPage VisaPage;
	
	@Before
	public void setUp() {
		
		VisaPage = new VisaPage(driver);
		driver = VisaPage.chromeDriverConnection();
		driver.manage().window().maximize();
		VisaPage.visit("https://phptravels.net/visa");

	}
	@After
	public void tearDown() {
		driver.quit();
	}
	@Test
	public void GoToAppStore() throws InterruptedException  {
		VisaPage.OpenStoreApple();
		Thread.sleep(2000);
		assertTrue(VisaPage.Apple());
	}
	@Test
	public void GoToPlayStore() throws InterruptedException {
		VisaPage.OpenPlayStore();
		Thread.sleep(2000);
		assertTrue(VisaPage.PlayStore());
	}
	@Test
	public void EmptyData() throws InterruptedException  {
		VisaPage.Search();
		Thread.sleep(200);
		assertTrue(VisaPage.WarningMesage());
	}
	
	

}
	