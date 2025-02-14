package lab4.pages;

import java.util.concurrent.StructuredTaskScope.Subtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class MainPage extends lab4.base{
	
    public MainPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	private WebDriver driver;
    
    private By CurrencyField = By.xpath("/html/body/header/div/div[2]/div[2]/ul/li[2]/a");
    private By EURO = By.xpath("/html/body/header/div/div[2]/div[2]/ul/li[2]/ul/li[4]/a");
    private By LanguageField = By.xpath("/html/body/header/div/div[2]/div[2]/ul/li[1]/a");
    private By France = By.xpath("/html/body/header/div/div[2]/div[2]/ul/li[1]/ul/li[5]/a");
    private By EUROVerifier = By.xpath("/html/body/main/section/div/div/div[2]/div[1]/div/div/div[1]/div/div[2]/div[2]/p/span");
    private By FranceVerifier = By.xpath("    /html/body/main/div[1]/div[2]/div[1]/h4\r\n");

    
    
    
    public void SetEuros() throws InterruptedException {
    	click(CurrencyField);
		Thread.sleep(1000);
		click(EURO);
    }
    
    public boolean Euro() throws InterruptedException{
    	String Euro = "EUR";
    	
		Thread.sleep(2000);
    	System.out.print(getText(EUROVerifier));
    

    	return getText(EUROVerifier).startsWith(Euro);
    }
    
    public void SetFrance() throws InterruptedException {
    	click(LanguageField);
		Thread.sleep(1000);
		click(France);
    }
    
    public boolean FranceVerifier() throws InterruptedException{
    	String France = "Votre voyage commence ici !";
    	
		Thread.sleep(2000);
    

    	return getText(FranceVerifier).equals(France);
    }
}

