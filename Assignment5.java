package Edureka;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\grkar\\OneDrive\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Nested Frames")).click();

		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-top']")))
		.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-middle']")));
		
		System.out.println(driver.findElement(By.xpath("//div[@id='content']")).getText());
		driver.switchTo().defaultContent().switchTo().defaultContent();
		driver.close();
	}
}
