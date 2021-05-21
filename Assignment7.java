package Edureka;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\grkar\\OneDrive\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://www.rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		System.out.println(driver.findElements(By.xpath("//table[@name='courses']//child::tbody/tr")).size());
		System.out.println(driver.findElements(By.xpath("//table[@name='courses']//child::tbody/tr/th")).size());
		List<WebElement> list = driver.findElements(By.xpath("//table[@name='courses']//child::tbody/tr[3]/td"));
		list.forEach(item ->{
			System.out.println(item.getText());
		});
		driver.close();
	}
}
