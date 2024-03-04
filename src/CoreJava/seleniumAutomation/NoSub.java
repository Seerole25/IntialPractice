package CoreJava.seleniumAutomation;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
// Variables // Functions [Method]
public class NoSub 
{ 
	@Test
	public void launchplication()
	{
	System.out.println("Test Case : Launch Applicatoin");
	System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\ChromeDrivers\\chromedriver.exe");
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://www.apsrtconline.in/oprs-web/");
	}
}