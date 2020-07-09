package TestSignPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	
	
	public static void main(String[] args) {
	System.setProperty("webdriver.crome.driver", "C:\\Users\\sinem\\Desktop\\chrome");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.trendyol.com/");
	
	driver.manage().window().maximize();
    driver.findElement(By.className("homepage-popup-gender")).click();
	WebElement SearchBox = driver.findElement(By.className("search-box"));
	SearchBox.sendKeys("bilgisayar");
	WebElement SearchIcon = driver.findElement(By.className("search-icon"));
	SearchIcon.click();
	
	driver.findElement(By.id("password")).sendKeys("sinem");

	driver.findElement(By.id("loginSubmit")).click();

	

	
	
}
}
	

	
	
	


