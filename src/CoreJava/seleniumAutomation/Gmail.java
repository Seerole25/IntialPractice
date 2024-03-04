package CoreJava.seleniumAutomation;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

// 4th Jan class video 
public class Gmail 
{
	String expectedTitle = "Gmail"; // Requirement by the customer
	//WebDriver Interface Implemented by classes like : ChromeDriver,FirefoxDriver,
	// for launching gmail application we require***
	//***WebDriver Interface : get(),getTitle(),getCurrentUrl(),getWindowHandle(),refresh(),minimize(),maximize(),close(),findElement(),findElements()
	//   WebDriver Elements : click(),clear(),sendkeys(),findElement(),findElements(),IsDisplayed(),IsEnabled(),getText(),getAttribute(),
	//Functions in By class : ID(), NAME(),CLASSNAME(),CSS SELECTOR(), LINKTEXT(),PARTIAL LINKTEXT(),TAGNAME(),XPATH().
			
	//ChromeDriver driver;
	WebDriver driver ; //= new ChromeDriver();
	public Gmail() // to Visible driver to login application we create a for visibility Constructor
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\ChromeDrivers\\chromedriver.exe");
		 driver= new ChromeDriver();// Here we create a object for ChromeDriver
	}
	
	@After
	public void closeApplication()
	{
		System.out.println("RC : Close Gmail Application");
		driver.quit();
	}
	
	@Before
	public void launchGmailApplication()
	{
		System.out.println("RC : Launch Gmail Application");
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		String actualTitle = driver.getTitle(); // From Here 6th Jan class video
		System.out.println("Current Title : "+actualTitle);
		System.out.println("Current URL : "+driver.getCurrentUrl());
		System.out.println("Current Session : "+driver.getWindowHandle());
		//Validation or Assertion means Comparing expected value with actual Title
		Assert.assertEquals(expectedTitle, actualTitle);
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("Validation title Passed");
		}
		else
		{
			System.out.println("Validation title Failed");
		}
		// Constructor-> Launch -> Login
		// Exception : NoSuchElementException appears when launchGmailApplication is not called form loginApplication
		// Selector or Locators : ID , NAME ,CLASSNAME ,CSS SELECTOR , LINKTEXT,PARTIAL LINK TEXT,TAGNAME ,XPATH
			
		// Xpaths : Fixed/Static/Absolute
		
		//Relative Xpaths are: 
		
		// //TagName[@attribute='value']
		// //TagName[text()='value']
		// //TagName[contains(@attribute'value')]
		// //TagName[contains(text()'value')]
		
		// //TagName[@attribute1='value' and @attribute2='value']
		// //TagName[text()='value' and @attribute='value']
		// //TagName[contains(@attribute1'value') and @attribute2='value2']
		// //TagName[contains(text()'value')and @attribute2='value2']
		
		// //*[@attribute1='value' and @attribute2='value']
		// //*[text()='value' and @attribute='value']
		// //*[contains(@attribute1'value') and @attribute2='value2']
		// //*[contains(text()'value')and @attribute2='value2']

		
	}
	@Test
	public void loginApplication()
	{
		//launchGmailApplication();
		System.out.println("RC : Login to Application");
		/*
		 * WebElement egmailObj = driver.findElement(By.name("identifier"));
		 * egmailObj.click(); egmailObj.sendKeys("nabasiuhQLSL"); egmailObj.clear();
		 * egmailObj.sendKeys("siva290594@gmail.com"); egmailObj.clear();
		 */
		driver.findElement(By.id("identifierId")).sendKeys("siva290594@gmail.com");// 7th Jan class video
		//driver.findElement(By.className("VfPpkd-vQzf8d")).click();
		List<WebElement> group = driver.findElements(By.className("VfPpkd-vQzf8d"));
		for (int i=0;i<group.size();i++)
		{
			WebElement element = group.get(i);
			String text = element.getText(); System.out.println("Text on the object :" +text);
			if (text.equals("Next")) // for click on Next button
					{
				       element.click();
				       break;
					}
		}

		
	}
	
	@Test
	public void forgotEmail()
	{
		//launchGmailApplication();
		System.out.println("Test Case : forgot Email");
		//driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/c-wiz/div/div[2]/div/div[1]/div/form/span/section/div/div/div[3]/button")).click();
		driver.findElement(By.tagName("button")).click();
	}
	@Test
	public void validateforgotEmail()
	{
		WebElement forgotEmail = driver.findElement(By.tagName("button"));
		if(forgotEmail.getText().equals("Forgot email?"))
		{
			String mytype = forgotEmail.getAttribute("type");
			System.out.println("Type Attribute : "+mytype);
			System.out.println("Type Attribute : "+forgotEmail.getAttribute("jsname"));
		}

	}
	@Test
	public void LearnMore()
	{
		//launchGmailApplication();
		System.out.println("Test Case : Learn More");
		//driver.findElement(By.tagName("a")).click(); or we can write below program also
		//driver.findElement(By.linkText("Learn more")).click(); or
		//driver.findElement(By.partialLinkText("Learn")).click(); or
		  driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/c-wiz/div/div[2]/div/div[1]/span/div/div/a")).click();
	}
	@Test
	public void createAccount()
	{
		//launchGmailApplication();
		System.out.println("Test Case : Create Account");
		List<WebElement>group= driver.findElements(By.className("VfPpkd-vQzf8d"));
		for (int i=0;i<group.size();i++)
		{
			WebElement element = group.get(i);
			String text = element.getText(); System.out.println("Text on the object :" +text);
			if (text.equals("Create account"))
					{
				       element.click();
				       break;
					}
		}
	}
	@Test
	public void ClickTerms()
	{
		//launchGmailApplication();
		System.out.println("Test Case : Terms");
		List<WebElement>group= driver.findElements(By.tagName("a"));
		for (int i=0;i<group.size();i++)
		{
			WebElement element = group.get(i);
			String text = element.getText(); 
			System.out.println("Text on the object :" +text);
			if (text.equals("Terms"))
				{
				      element.click();
				      break;
				}
		}
	}
	
}