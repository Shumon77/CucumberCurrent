package pagesPac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CucumberPages {
	
	WebDriver driver;
	
	
	  public CucumberPages(WebDriver driver) {
		   
		  this.driver=driver;
		    
	  }
	  
	  
	  public WebElement getUserId() {
		  
		WebElement userid = driver.findElement(By.id("login-username"));   
		  
		return userid;
		
	  }
	  
	  
	  public WebElement getNextButton() {
		  
		WebElement nextbutton = driver.findElement(By.id("login-signin"));   
			  
		return nextbutton;
			
		  }
		  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  

}
