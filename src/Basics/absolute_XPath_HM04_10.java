package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class absolute_XPath_HM04_10 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		
		driver.findElements(By.xpath("//div[@class='column follow-us']/ul/li[1]/a"));
		
		//********* For Regitration***********
		
//		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li/a[1]")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.id("gender-male")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.id("FirstName")).sendKeys("Pratik");
//		Thread.sleep(3000);
//		driver.findElement(By.id("LastName")).sendKeys("Chaudhari");
//		Thread.sleep(3000);
//		driver.findElement(By.id("Email")).sendKeys("pratik.34312121@gmail.com");
//		Thread.sleep(3000);
//		driver.findElement(By.id("Password")).sendKeys("Sonu@123");
//		Thread.sleep(3000);
//		driver.findElement(By.id("ConfirmPassword")).sendKeys("Sonu@123");
//		Thread.sleep(3000);
//		driver.findElement(By.id("register-button")).click();
//		Thread.sleep(3000);	
		
		//********* For Login***********
//		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li[2]/a")).click();
//		Thread.sleep(3000);	
//		driver.findElement(By.id("Email")).sendKeys("pratik.34312121@gmail.com");
//		Thread.sleep(3000);	
//		driver.findElement(By.id("Password")).sendKeys("Sonu@123");
//		Thread.sleep(3000);	
//		driver.findElement(By.cssSelector(".button-1.login-button")).click();
//		
//		Thread.sleep(3000);	
//		driver.close();
	}

}
