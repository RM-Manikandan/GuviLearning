package task10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Program02 {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		
		Actions ac = new Actions(driver);
		
		WebElement draggableElement = driver.findElement(By.id("draggable"));
		WebElement droppableElement = driver.findElement(By.id("droppable"));
		String BeforecssValue = droppableElement.getCssValue("color");
		ac.dragAndDrop(draggableElement, droppableElement).build().perform();
		
		String text = driver.findElement(By.xpath("//div[@id='droppable']//p")).getText();
		String AftercssValue = droppableElement.getCssValue("color");
		
		if(text.contains("Dropped!") && !(BeforecssValue.equals(AftercssValue))) {
			System.out.println("Testcase is Passed");
		}
		
}

}
