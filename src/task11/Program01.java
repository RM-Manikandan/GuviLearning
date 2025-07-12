package task11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program01 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.findElement(By.linkText("Click Here")).click();
		Object[] array = driver.getWindowHandles().toArray();
		
		
		driver.switchTo().window((String) array[1]);
		
		System.out.println(driver.getTitle());
		
		driver.quit();

	}

}
