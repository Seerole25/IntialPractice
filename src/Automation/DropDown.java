package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
    public static void main(String[] args) {
        System.setProperty("WebDriver.chrome.driver", "E:\\VIKPROJECT\\chro\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");
        //Using Select class for selecting value from dropdown
        Select dropdown = new Select(driver.findElement(By.id("testingDropdown")));
        dropdown.selectByVisibleText("Database Testing");
        // Close the Browser
        driver.close();
    }
}