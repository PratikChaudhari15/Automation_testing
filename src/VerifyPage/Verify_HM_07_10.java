package VerifyPage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_HM_07_10 {

	public static void main(String[] args) throws InterruptedException {
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
		
		driver.findElement(By.className("ico-login")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("Email")).sendKeys("pratik.chaudhari1407@gmail.com");
		Thread.sleep(3000);
		
		driver.findElement(By.id("Password")).sendKeys("Pratik@123");
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector(".button-1.login-button")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Computers")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[1]/div[1]/div/div/a")).click();
		
		Thread.sleep(3000);
		driver.close();
		
	}
}
