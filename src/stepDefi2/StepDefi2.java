package stepDefi2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefi2 {
	
	WebDriver driver;
	
	@Given("^User is in the log in page$")
	public void user_is_in_the_log_in_page() {
	    
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\syeds\\OneDrive\\Desktop\\Libraries\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		
		driver.get("https://login.yahoo.com/?.lang=en-US&src=frontpage&done=https%3A%2F%2Fwww.yahoo.com%2F");
	
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    
	    
	   driver.manage().window().maximize();
	
		
		
	}

	@When("^User enter userId$")
	public void user_enter_userId()  {
	    
		
	}

	@Then("^User enter password$")
	public void user_enter_password() {
	   
		
		
	}

	@Then("^User click on the submit button$")
	public void user_click_on_the_submit_button() {
	    
		WebElement login = driver.findElement(By.name("signin"));
		
		login.isDisplayed();
		
		System.out.println(login);
		
		
	}
	

}
