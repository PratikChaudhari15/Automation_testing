package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HM28_10_RightClick {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(1000);
		Actions act = new Actions(driver);
		WebElement rightclick =driver.findElement(By.xpath("//span[text()='right click me']"));
		WebElement copy = driver.findElement(By.xpath("//span[text()='copy']"));
		act.contextClick(rightclick).perform();
	    driver.close();
	}

}