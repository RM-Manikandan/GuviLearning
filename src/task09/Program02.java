package task09;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program02 {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		if(title.equals("STORE")) {
			System.out.println("Page landed on correct website");
		}
		else
		{
			System.out.println("Page not landed on correct website");
		}
		
		driver.close();
	}

}
