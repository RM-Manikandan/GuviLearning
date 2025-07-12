package task09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program03 {
	
	public static void main(String[] args) {
		 
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		driver.findElement(By.id("searchInput")).sendKeys("Artificial intelligence");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("(//a //span[text()='View history'])[1]")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		
	}
}
