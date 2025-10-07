package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_FaceBook {
	public static void main(String[]args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(@id,'u_0_0_')]")).click();
		
		Thread.sleep(3000);
		driver.close();
			
	}
}
