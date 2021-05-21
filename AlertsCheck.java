package Edureka;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsCheck {
	public static void main(String[] args) throws InterruptedException {
		String text = "Rahul";
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\grkar\\OneDrive\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//Alert Message handling

		driver.get("http://demo.guru99.com/test/delete_customer.php");

		driver.findElement(By.name("cusid")).sendKeys("53920");
		driver.findElement(By.name("submit")).submit();

// Switching to Alert        
		Alert alert = driver.switchTo().alert();

// Capturing alert message.    
		String alertMessage = driver.switchTo().alert().getText();

// Displaying alert message		
		System.out.println(alertMessage);
		Thread.sleep(2000);

// Accepting alert		
		alert.accept();
		Thread.sleep(2000);
		driver.close();
	}

}