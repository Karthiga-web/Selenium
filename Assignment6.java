package Edureka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment6 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\grkar\\OneDrive\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		String value = driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]")).getText().trim();
		driver.findElement(By.xpath("//*[@id='checkBoxOption2']")).click();
		WebElement staticdropdown = driver.findElement(By.xpath("//*[@id=\"dropdown-class-example\"]"));
		Select dropdown = new Select(staticdropdown);
		dropdown.selectByVisibleText(value);
		driver.findElement(By.id("name")).sendKeys(value);
		driver.findElement(By.id("alertbtn")).click();
		Assert.assertTrue(driver.switchTo().alert().getText().contains(value));
	}
}
