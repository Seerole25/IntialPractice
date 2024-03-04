package CoreJava.seleniumAutomation;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
// Variables // Functions [Method]
public class APSRTC 
{
	WebDriver driver;
	
	public APSRTC()
	{
		
		System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\ChromeDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	@Test
	public void launchApplication()
	{
		driver.get("https://www.apsrtconline.in/oprs-web/");
		driver.manage().window().maximize();
		/*
		 * driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(
		 * "siva_2905");
		 * driver.findElement(By.xpath("//input[@name='password']")).sendKeys(
		 * "Siv@290594"); driver.findElement(By.xpath("//*[@id='submitBtn']")).click();
		 */
	}
	
	@Test
	public void bookticket() throws InterruptedException
	{
		launchApplication();
		driver.findElement(By.xpath("//a[@class='user']")).click();
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("siva_2905");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys( "Siv@290594"); 
		driver.findElement(By.xpath("//*[@id='submitBtn']")).click();
		//driver.findElement(By.xpath("//*[@name='source']")).sendKeys("HYDERABAD");
		WebElement sourcecity = driver.findElement(By.xpath("//*[@name='source']"));
		if(sourcecity.isEnabled())
		{
		//Thread.sleep(2000);
		Actions actions = new Actions(driver);
		//actions.sendKeys(Keys.ENTER).perform();
		actions.moveToElement(sourcecity).click().sendKeys("HYDERABAD").pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).build().perform();
		//WebElement search = driver.findElement(By.xpath("//*[@name='searchBtn']"));
		//actions.moveToElement(search).click().build().perform();
		//driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//*[@name='destination']")).sendKeys("Guntur");
		Thread.sleep(2000);
		actions.sendKeys(Keys.ENTER).perform();
		driver.findElement(By.xpath("//*[@name='txtJourneyDate']")).click();		
		String mydate ="15";
		driver.findElement(By.xpath("//*[text()='"+mydate+"']")).click();
		driver.findElement(By.xpath("//input[@name ='searchBtn']")).click();
		System.out.println("Clicked on search button");
		driver.findElement(By.xpath("//a[@title='Ticket Status']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@title='Track Service']")).click();
        }
		else
		{
			System.out.println("Source City is not Enabled");	
		}
		driver.findElement(By.xpath("//a[@title='Logout']")).click();
	    //driver.close();		 
	}

}