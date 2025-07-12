package task10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program01 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("datepicker")).click();
		
		driver.findElement(By.xpath("//a[@title='Next']")).click();
		
		List<WebElement> rowElements = driver.findElements(By.tagName("tr"));
		System.out.println(rowElements.size());
		
		for(int i=0 ; i<rowElements.size(); i++) {
			
			List<WebElement> columnElements = rowElements.get(i).findElements(By.tagName("td"));
			
			for (int j = 0; j < columnElements.size(); j++) {
				
				String Date = columnElements.get(j).getText();
				//System.out.println("Current Date"+Date);
				if (Date.equals("22")) {
					columnElements.get(j).click();
				}
				
				
			}
			
		}
		driver.close();
	}

}
