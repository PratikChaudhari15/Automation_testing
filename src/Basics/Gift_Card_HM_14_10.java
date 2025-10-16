package Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gift_Card_HM_14_10 {

//	•	Open the browser
//	•	Maximize browser
//	•	Enter into the DWS home page
//	•	Click gift card section 
//	•	After entering add all the gift card products
//	•	(Use Find Elements)
//	•	Close the browser

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Gift Cards")).click();
		
		List<WebElement> addproduct = driver.findElements(By.xpath("//div[@class='product-grid']/div/div/div[2]/div[3]/div[2]/input"));
		for(WebElement web : addproduct)
		{
			web.click();
			Thread.sleep(2000);
			driver.findElement(By.className("recipient-name")).sendKeys("Pratik");
			Thread.sleep(2000);
			driver.findElement(By.className("recipient-email")).sendKeys("pratik.chaudhari@gmail.com");
			driver.findElement(By.className("sender-name")).sendKeys("Sid");
			Thread.sleep(2000);
			driver.findElement(By.className("sender-email")).sendKeys("sid@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.className("message")).sendKeys("Happpy Bday");
			driver.findElement(By.cssSelector(".button-1.add-to-cart-button")).click();
			driver.navigate().back();
		}
		Thread.sleep(3000);
		driver.close();
	}

}
