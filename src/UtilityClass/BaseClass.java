package UtilityClass;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public static ChromeDriver driver = null;
	public static void preConditions() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
	}
	public static void login()
	{
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys("Admin01@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("admin01");
		driver.findElement(By.cssSelector(".button-1.login-button")).click();
	}
	public static void logout() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.linkText("Log out")).click();
	}
	
	public static void postCondition1() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.close();
	}
	public static void postCondition2() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}
}
