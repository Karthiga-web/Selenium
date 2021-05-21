package Edureka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\grkar\\OneDrive\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.cleartrip.com/");
		WebElement staticDropdown = driver.findElement(By.xpath("//select[@id='Adults']"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(4);
		Assert.assertEquals(4, dropdown.getFirstSelectedOption().getText());
		
		WebElement staticDropdown2 = driver.findElement(By.xpath("//select[@id='Childrens']"));
		Select dropdown2 = new Select(staticDropdown2);
		dropdown2.selectByVisibleText("2");
		Assert.assertEquals(2, dropdown2.getFirstSelectedOption().getText());
		
		WebElement staticDropdown3 = driver.findElement(By.xpath("//select[@id='Infants']"));
		Select dropdown3 = new Select(staticDropdown3);
		dropdown3.selectByValue("1");
		Assert.assertEquals(1, dropdown3.getFirstSelectedOption().getText());
		
		driver.findElement(By.xpath("//input[@id='DepartDate']")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		driver.findElement(By.xpath("//a[@id='MoreOptionsLink']")).click();
		
		WebElement staticDropdown4 = driver.findElement(By.xpath("//select[@id='Class']"));
		Select dropdown4 = new Select(staticDropdown4);
		dropdown4.selectByValue("First");
		
		driver.findElement(By.xpath("//input[@name='airline']")).sendKeys("Delta");
		driver.findElement(By.xpath("//input[@id='SearchBtn']")).click();
		
		System.out.println(driver.findElement(By.xpath("//div[@id='homeErrorMessage']")).getText());
	}
}
