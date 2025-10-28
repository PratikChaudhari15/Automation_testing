package Basics;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo_Drop_Down_17_10 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/"); 
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("/digital-downloads")).click();
        
		WebElement singleSelect= driver.findElement(By.id("products-orderby"));
		Select sel=new Select(sortBy);
		Thread.sleep(2000);
		List<WebElement> order= sel.getOptions();
		for(WebElement web: order)
		{
			web.click();
			Thread.sleep(1000);
		}
		Thread.sleep(1000);
		driver.close();
	}

}
