package UtilityClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class addProduct_HM_01_11 extends BaseClass {
	public static void main(String[]args) throws InterruptedException
	{
		preConditions();
		Thread.sleep(2000);
		login();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[3]/div/div/div[3]/div[3]/div/div[2]/div[3]/div[2]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("cart-label")).click();
		Thread.sleep(2000);
		
		WebElement cartProduct = driver.findElement(By.linkText("14.1-inch Laptop"));

		if (cartProduct.isDisplayed()) {
		    System.out.println("Correct product is present in the cart.");
		} else {
		    System.out.println("Product not found in the cart.");
		}
		logout();
		Thread.sleep(3000);
		postCondition2();
		
	}
}
