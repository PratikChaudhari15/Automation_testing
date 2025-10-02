package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HM01_09 {

//	Open the browser 
//	Maximize the browser 
//	Enter into dws
//	After entering add 25$ virtual gift card 
//	Fill all the details of gift card
//	And change the quantity into 2 then later click add to cart
//	Then remove it
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector(".button-2.product-box-add-to-cart-button")).click();	
		Thread.sleep(2000);
		driver.findElement(By.className("recipient-name")).sendKeys("Pratik");
		Thread.sleep(2000);
		driver.findElement(By.className("recipient-email")).sendKeys("pratik.chaudhari1265@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.className("sender-name")).sendKeys("Sidharth");
		Thread.sleep(2000);
		driver.findElement(By.className("sender-email")).sendKeys("sid.shirsath2363@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.className("message")).sendKeys("I LOVE YOU BRO ");
		Thread.sleep(2000);
		driver.findElement(By.id("addtocart_2_EnteredQuantity")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("addtocart_2_EnteredQuantity")).sendKeys("2");
		Thread.sleep(2000);
		driver.findElement(By.id("add-to-cart-button-2")).click();
		
		driver.findElement(By.className("ico-cart")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("removefromcart")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("updatecart")).click();
		
		Thread.sleep(4000);
		driver.close();
		
		
	}

}
