package Edureka;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ECartPAge {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\grkar\\OneDrive\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot" };
		driver.navigate().to("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);
		addItems(driver, itemsNeeded);
		driver.findElement(By.xpath("//a[@class='cart-icon']/img")).click();
		System.out.println(driver.findElement(By.xpath("//div[contains(@class,'cart-preview')]")).isDisplayed());
		if(driver.findElement(By.xpath("//div[contains(@class,'cart-preview')]")).isDisplayed()) {
			driver.findElement(By.xpath("//div[contains(@class,'cart-preview')]/div[2]/button")).click();
		}
		Thread.sleep(1500);
		driver.findElement(By.xpath("//div[@class='products']/div/button")).click();

		Thread.sleep(3000);
		driver.close();
	}

	public static void addItems(WebDriver driver, String[] itemsNeeded) {
		int j = 0;
		List<WebElement> products = driver.findElements(By.xpath("//div[@class='product']/h4"));
		for (int i = 0; i < products.size(); i++) {
//Brocolli - 1 Kg
//Brocolli,    1 kg
			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();
//format it to get actual vegetable name
//convert array into array list for easy search
//  check whether name you extracted is present in arrayList or not-
			List itemsNeededList = Arrays.asList(itemsNeeded);
			if (itemsNeededList.contains(formattedName)) {
				j++;
//click on Add to cart
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j == itemsNeeded.length) {
					break;
				}
			}
		}
	}
}