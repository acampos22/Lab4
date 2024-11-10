package lab4.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class loginpage extends lab4.base{
	
    public loginpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	private WebDriver driver;
    
    private By emailField = By.xpath("/html/body/main/div[1]/form/div/div/div/div[1]/input");
    private By passwordField = By.xpath("/html/body/main/div[1]/form/div/div/div/div[2]/input");
    private By loginButton = By.xpath("/html/body/main/div[1]/form/div/div/div/div[4]/div[1]/button");

    
    public void setEmail(String email) {
    	type(email,emailField);
    }
    
    public void setPassword(String password) {
    	type(password,passwordField);
    }
    
    public void clickLoginButton() {
    	click(loginButton);
    }
    
    
    public void login(String email, String password) {
    	setEmail(email);
        setPassword(password);
        clickLoginButton();
    }
    
    public boolean logged() {
    	System.out.print(getUrl()); 
    	String url = "https://phptravels.net/dashboard";
    	return (url.equals(getUrl()));
    }
}
