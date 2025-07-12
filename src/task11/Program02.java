package task11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class Program02 {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://the-internet.herokuapp.com/nested_frames");
		
		driver.switchTo().frame("frame-top");
		
		List<WebElement> elements = driver.findElements(By.tagName("frame"));
		
		System.out.println(elements.size());
		
		if(elements.size() == 3) {
			System.out.println("Verified three frames are available");
		}
		
		
		driver.switchTo().frame("frame-left");
		System.out.println(driver.findElement(By.tagName("body")).getText());
		
		driver.switchTo().parentFrame();
		
		driver.switchTo().frame("frame-middle");
		System.out.println(driver.findElement(By.tagName("body")).getText());
		
		driver.switchTo().parentFrame();
		
		driver.switchTo().frame("frame-right");
		System.out.println(driver.findElement(By.tagName("body")).getText());
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame-bottom");
		System.out.println(driver.findElement(By.tagName("body")).getText());
		
		driver.quit();
		
		
		
		
		
	}

}
