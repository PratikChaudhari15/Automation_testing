package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
//		driver.findElement(By.linkText("Create new account")).click();
		
		driver.findElement(By.partialLinkText("Create")).click();
		Thread.sleep(3000);
		driver.close();
		

	}

}
