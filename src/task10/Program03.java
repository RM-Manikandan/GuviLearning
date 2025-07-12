package task10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Program03 {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		
		driver.get("https://www.guvi.in/");
		
		driver.findElement(By.linkText("Sign up")).click();
		
		driver.findElement(By.id("name")).sendKeys("Roberts");
		driver.findElement(By.id("email")).sendKeys("Roberto.Hirthe@gmail.com");
		driver.findElement(By.id("password")).sendKeys("djXxBZOj4MBtSE4");
		driver.findElement(By.id("mobileNumber")).sendKeys("7232355677");
		
		driver.findElement(By.id("signup-btn")).click();
		WebElement profileDrpDwn = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//select[@id='profileDrpDwn']")));
		WebElement degreeDrpDwn = driver.findElement(By.id("degreeDrpDwn"));
		
		Select sc = new Select(profileDrpDwn);
		sc.selectByIndex(2);
		
		Select sc1 = new Select(degreeDrpDwn);
		sc1.selectByIndex(2);
		
		driver.findElement(By.id("year")).sendKeys("2023");
		
		driver.findElement(By.id("details-btn")).click();
		
		String Heading = driver.findElement(By.tagName("h1")).getText();
		
		System.out.println(Heading);
	}

}
