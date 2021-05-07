package Edureka;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksCount {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\grkar\\OneDrive\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		// entire page links
		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println(list.size());
		// footer section links
		WebElement footer = driver.findElement(By.id("gf-BIG"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		// first column footer links
		WebElement coloumndriver = footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		int size = coloumndriver.findElements(By.tagName("a")).size();
		for (int i = 1; i < coloumndriver.findElements(By.tagName("a")).size(); i++) {
			String clickonlinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);

			coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
			Thread.sleep(5000L);
		}
		Set<String> abc=driver.getWindowHandles();//4
		Iterator<String> it=abc.iterator();
		
		while(it.hasNext())
		{
			
		   driver.switchTo().window(it.next());
		   System.out.println(driver.getTitle());
		   driver.close();
		
		}
	}

}
