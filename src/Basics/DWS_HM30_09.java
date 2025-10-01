package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DWS_HM30_09 {
	public static void main(String[]args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(3000);
		
		driver.findElement(By.className("ico-register")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("gender-male")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("FirstName")).sendKeys("Pratik");
		Thread.sleep(1000);
		driver.findElement(By.id("LastName")).sendKeys("Chaudhari");
		Thread.sleep(1000);
		driver.findElement(By.id("Email")).sendKeys("pratik.chaudhari1407@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("Password")).sendKeys("Pratik@123");
		Thread.sleep(1000);
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Pratik@123");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("register-button")).click();
		
		Thread.sleep(3000);
		driver.close();
		
	}

}
