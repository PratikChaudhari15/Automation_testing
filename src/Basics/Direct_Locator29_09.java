package Basics;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class Direct_Locator29_09 {
	public static void main(String[]args) throws InterruptedException
	{
		//-----Locator by using Tag Name-----
		
		ChromeDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement searchfield = driver.findElement(By.tagName("input"));
		searchfield.sendKeys("computer");
		Thread.sleep(3000);
		
		driver.findElement(By.className("button-1")).click();
		Thread.sleep(3000);
		driver.close();
		
		
		//************* For Register Button******************
//		ChromeDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://demowebshop.tricentis.com/");
//		Thread.sleep(3000);
//		driver.findElement(By.className("ico-register")).click();
//		Thread.sleep(3000);
//		driver.close();
	}

}
