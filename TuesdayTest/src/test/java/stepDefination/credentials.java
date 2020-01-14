package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class credentials {
	
	static WebDriver driver;
	public String matches;
	@Given("Navigate to home page")
	public void navigate_to_home_page() {
		
		//Given a path of chromeBrowser driver---C:\\Users\\training_d2.03.07\\Downloads\\chromedriver_win32 (32)\\chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		//Navigate to the URL
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
		
		//Maximize the window
		driver.manage().window().maximize();
	}
	
	@When("user enters the username and password {string} {string}")
	public void user_enters_the_username_and_password(String string, String string2) {
		
		//Entering username in the password field
		driver.findElement(By.id("userName")).sendKeys(string);
		
		//Entering password in the password field
		driver.findElement(By.id("password")).sendKeys(string2);
		
		//clicking the login button
		driver.findElement(By.xpath(".//input[@value='Login']")).click();
		
		//verify the credentials
//		if (driver.getTitle().contentEquals("Home")) {
		
//			driver.close();
//		} else {
//			driver.close();
//		}
//		driver.getTitle().contentEquals("Home");
		
		
	}
	
	@Then("Message login successfully")
	public void message_login_successfully() {
		String title = driver.getTitle();
		if(title=="Home") {
			System.out.println("Login Successfully");
			driver.close();
		}
		driver.close();
	}

}
