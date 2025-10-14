package VerifyPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_on_WEB_Page {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		WebElement excellent = driver.findElement(By.id("pollanswers-1"));
		if(excellent.isEnabled()) {
			System.out.println("Excellent Radio Button is Enabled");
			excellent.click();
			System.out.println("Pass");
		}
		else {
			driver.close();
			throw new Exception("Excellent radio button is not enabled and testScript fails");
		}
		driver.close();

	}

}
