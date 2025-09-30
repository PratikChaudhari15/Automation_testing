package Basics;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocator_HM_29_09 {
	public static void main(String[]args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.className("ico-register")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.className("ico-login")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.className("ico-cart")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.className("ico-wishlist")).click();
		Thread.sleep(3000);
		
		driver.close();
		
	}

}
