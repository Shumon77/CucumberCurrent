package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pagesPac.CucumberPages;

public class StepDefination {
	
	WebDriver driver;
	
	CucumberPages pr;
	
	
	@Given("^User is in sign in page$")
	public void user_is_in_sign_in_page(){
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\syeds\\OneDrive\\Desktop\\Libraries\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		pr = new CucumberPages(driver);
		
		driver.get("https://login.yahoo.com/?.lang=en-US&src=homepage&specId=yidregsimplified&activity=ybar-signin&pspid=2023538075&.done=https%3A%2F%2Fwww.yahoo.com%2F&done=https%3A%2F%2Fwww.yahoo.com%2F&intl=us&prompt=login");
	
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    
	    //driver.manage().deleteAllCookies();
	    
	    driver.manage().window().maximize();
	
		
		
		
		
	    
	}

	@When("^User enter right username$")
	public void user_enter_right_username(){
		
		pr.getUserId().sendKeys("syed.shumon77@icloud.com");
	    
	}

	@Then("^User enter right password$")
	public void user_enter_right_password(){
		
		
	    
	}

	@Then("^User click on next button$")
	public void user_click_on_next_button(){
		
	boolean nextButton =	pr.getNextButton().isDisplayed();
	
	  System.out.println(nextButton);
	  
	  Assert.assertTrue(nextButton);
	    
	}
	
	
	//Negative Testing
	
	
	@Given("^User is in the sign in page$")
	public void user_is_in_the_sign_in_page(){
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\syeds\\OneDrive\\Desktop\\Libraries\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		pr = new CucumberPages(driver);
		
		driver.get("https://login.yahoo.com/?.lang=en-US&src=homepage&specId=yidregsimplified&activity=ybar-signin&pspid=2023538075&.done=https%3A%2F%2Fwww.yahoo.com%2F&done=https%3A%2F%2Fwww.yahoo.com%2F&intl=us&prompt=login");
	
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    
	    //driver.manage().deleteAllCookies();
	    
	    driver.manage().window().maximize();
	
	    
	}

	@When("^User enter wrong username$")
	public void user_enter_wrong_username(){
		
		pr.getUserId().sendKeys("tom.@tom.com");
	    
	}

	@Then("^User enter wrong password$")
	public void user_enter_wrong_password(){
		
	    
	}

	@Then("^User click on the next button$")
	public void user_click_on_the_next_button(){
		
		pr.getNextButton().click();
		
	    
	}
	
	
	
	// Data Driven Testing
	
	
	
	@Given("^user is in the signin page$")
	public void user_is_in_the_signin_page()  {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\syeds\\OneDrive\\Desktop\\Libraries\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		pr = new CucumberPages(driver);
		
		driver.get("https://login.yahoo.com/?.lang=en-US&src=homepage&specId=yidregsimplified&activity=ybar-signin&pspid=2023538075&.done=https%3A%2F%2Fwww.yahoo.com%2F&done=https%3A%2F%2Fwww.yahoo.com%2F&intl=us&prompt=login");
	
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    
	    //driver.manage().deleteAllCookies();
	    
	    driver.manage().window().maximize();
	
	    
	}

	@When("^user enters \"([^\"]*)\" in the userid textbox$")
	public void user_enters_in_the_userid_textbox(String UserID)  {
		
		driver.findElement(By.name("username")).sendKeys(UserID);
	   
	}

	@Then("^user click on SignIn button$")
	public void user_click_on_SignIn_button()  {
		
		driver.findElement(By.name("signin")).click();
	    
	}

	@Then("^user is in the expected \"([^\"]*)\"$")
	public void user_is_in_the_expected(String Webpage)  {
		
		String actualResult = driver.getCurrentUrl();
		
		String expectedResult = Webpage;
	    
		Assert.assertEquals(actualResult, expectedResult);
		
		
	}

	
	
	
	
	
	// Yahoo log in test
	
	
	
	
	// Parameterized testing
	
	
	@Given("^user navigate to the log in page$")
	public void user_navigate_to_the_log_in_page()  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\syeds\\OneDrive\\Desktop\\Libraries\\chromedriver.exe");
			
		driver = new ChromeDriver();
			
		driver.get("https://login.yahoo.com/?.lang=en-US&src=frontpage&done=https%3A%2F%2Fwww.yahoo.com%2F");
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		    
		driver.manage().window().maximize();
		
			
	    
	}



	@When("^user enters \"([^\"]*)\" in the user name textbox$")
	public void user_enters_in_the_user_name_textbox(String username) {
	   
		driver.findElement(By.id("login-username")).sendKeys(username);
	}

	@Then("^user enters \"([^\"]*)\" in the password textbox$")
	public void user_enters_in_the_password_textbox(String arg1)  {
		
		driver.findElement(By.id("login-signin")).click();
	   
	}

	@Then("^user is in the expected webpage \"([^\"]*)\"$")
	public void user_is_in_the_expected_webpage(String webpage)  {
	    
		
		String expectedResult = webpage;
		
		String actualResult = driver.getCurrentUrl();
		
		Assert.assertEquals(actualResult, expectedResult);
		
	}


	
	

}
