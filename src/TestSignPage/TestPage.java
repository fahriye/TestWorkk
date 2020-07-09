package TestSignPage;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		System.setProperty("webdriver.crome.driver", "C:\\Users\\sinem\\Desktop\\chrome");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.trendyol.com/");
	    driver.findElement(By.cssSelector("login-container")).click();
		driver.findElement(By.className("account-button login")).click();
		driver.findElement(By.className("email")).sendKeys("sinem_baskann@outlook.com");
		
		/*WebElement element = driver.findElement(By.className("fancybox-item fancy-close"));

		if (element.isEnabled()) {
		  element.click();
		} else {
		  System.out.println("Disable");
		}*/
		

	}

}
