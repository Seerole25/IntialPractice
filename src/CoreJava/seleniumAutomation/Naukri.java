package CoreJava.seleniumAutomation;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
// Variables // Functions [Method]
public class Naukri 
{
	String expectedTitle = "Naukri"; // Requirement by the customer
	
	WebDriver driver ; //= new ChromeDriver();

	public Naukri() // to Visible driver to login application we create a for visibility Constructor
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\ChromeDrivers\\chromedriver.exe");
		 driver= new ChromeDriver();// Here we create a object for ChromeDriver
	}	 
	@Test
	public void launchNaukriApplication()
	{
		System.out.println("RC : Launch Gmail Application");
		driver.get("https://www.naukri.com/nlogin/login");
		driver.manage().window().maximize();
		}
	// Xpath types = Fixed/Static/Absolute , 
	//Relative
	//Signature of Xpath to take = //TagName[@attribute='value'] or 
	//if it contains text the Xpath=//TagName[text()='value']
	
	@Test
	public void login() throws InterruptedException
	{
		launchNaukriApplication();
		//WebElement login = driver.findElement(By.xpath(""));
		WebElement N = driver.findElement(By.id("usernameField"));
		N.click();
		N.sendKeys("siva299405@gmail.com");
		//N.sendKeys("7287883081");
		WebElement p = driver.findElement(By.xpath("//*[@id=\"passwordField\"]"));
		//p.click();
		p.sendKeys("Siva@290594");
		driver.findElement(By.className("fs13")).click(); // Show passowrd
		//driver.findElement(By.className("waves-effect waves-light btn-large btn-block btn-bold blue-btn textTransform")).click();
		driver.findElement(By.xpath("//button[@class='waves-effect waves-light btn-large btn-block btn-bold blue-btn textTransform']")).click();
		//driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div/div/div/div[2]/div/form/div[2]/div[3]/div/button[1]")).click();//for Login button
		//button[text()='Login']----->Relative Xpath for Login
		//driver.findElement(By.xpath("//div[@class='nI-gNb-drawer__icon']")).click();
		//driver.findElement(By.className("nI-gNb-drawer__bars")).click();
		
		//driver.findElement(By.tagName("span")).click();
		 //driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div[3]/div/div[1]")).click();
		//Thread.sleep(4000);
		//driver.findElement(By.xpath("//span[@class='nI-gNb-sb__placeholder']")).click();//for search jobs
	    //driver.findElement(By.xpath("//input[@placeholder='Enter keyword / designation / companies']")).sendKeys("Executive");
		
		  //driver.findElement(By.xpath("//div[@class='nI-gNb-nc__icon-wrapper']")).click();
		  driver.findElement(By.xpath("//div[@class='nI-gNb-drawer__bars']")).click();
		 		
		//driver.findElement(By.xpath("//a[@title='Logout']")).click(); // for logout from application
		//driver.close();
	}
	


}
