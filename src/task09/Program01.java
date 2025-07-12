package task09;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Program01 {
	
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		driver.navigate().refresh();
		driver.quit();
	}

}
