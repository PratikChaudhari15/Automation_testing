package VerifyPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyByWebElement {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/books/");
		
		try {
			WebElement poll = driver.findElement(By.xpath("//Strong[text()='Community poll']"));
			System.out.println("Pass");
		}
		catch(Exception e)
		{
			driver.close();
			throws new Exception("fail");
		}
		driver.close();
	}
}
