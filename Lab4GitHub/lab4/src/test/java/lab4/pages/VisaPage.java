package lab4.pages;

import java.util.concurrent.StructuredTaskScope.Subtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class VisaPage extends lab4.base{
	
    public VisaPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	private WebDriver driver;
    
    private By playStore = By.xpath("/html/body/div[3]/div/div/div[2]/div/a[1]");
    private By AppleStore = By.xpath("/html/body/div[3]/div/div/div[2]/div/a[2]");
    private By searchButton = By.xpath("/html/body/main/section/section/div/div/div/form/div/div[4]/button");
    private By WarningMesage = By.xpath("/html/body/main/section/section/div/div/div/form/div/div[2]/div[1]/div[2]/span");
    public void OpenStoreApple() {
    	click(AppleStore);
    }
    public void OpenPlayStore() {
    	click(playStore);
    }
    public void Search() {
    	click(searchButton);
    }
    
    
    public boolean WarningMesage() {return isDisplayed(WarningMesage);}
    
    
    public boolean PlayStore() {
    	System.out.print(getUrl()); 
    	String url = "https://play.google.com/store/apps/details?id=com.phptravelsnative";
    	return (url.equals(getUrl()));
    }
    public boolean Apple() {
    	System.out.print(getUrl()); 
    	String url = "https://apps.apple.com/us/app/phptravels/id1018217005";
    	return (url.equals(getUrl()));
    }
}
