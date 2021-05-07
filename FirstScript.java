package Edureka;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;

public class FirstScript {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\grkar\\OneDrive\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.get("https://login.yahoo.com/");
//		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("karthigalakshmidevi@yahoo.com");
//		Thread.sleep(10000);
//		driver.findElement(By.xpath("//input[@id='login-signin']")).click();
//		System.out.println(driver.getCurrentUrl());
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getPageSource());
//		driver.navigate().back();
//		driver.close();//closes the current page
//		driver.quit();//closes all pages opened.
		driver.get("https://www.rediff.com/");
//		Thread.sleep(6000);
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("se");
		driver.findElement(By.cssSelector("input#password")).sendKeys("seefvrdf");
		driver.findElement(By.xpath("//input[contains(@name,'procee')]")).click();
		Thread.sleep(6000);
//		driver.findElement(By.id("email")).sendKeys("My first code");
//		driver.findElement(By.name("pass")).sendKeys("12345$");
//		driver.findElement(By.cssSelector("#pass")).sendKeys("12345$");
//		driver.findElement(By.linkText("Forgot Password?")).click();
//		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		driver.close();
	}
}
