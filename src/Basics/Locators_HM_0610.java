package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_HM_0610 {
	
//	•	Open the browser
//	•	Maximazie broser
//	•	Enter into dws home page
//	•	After entering click digital download
//	•	Read the price of all the products in digital download
//	•	By using Depeneted and indepenetd xpath
//	•	Close the browser

	public static void main(String[]args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);	
		//tagname[text()='Login']
		//driver.findElement(By.xpath("//a[text()='Digital downloads']")).click();

		//a[contains(text(), 'Register')]
		driver.findElement(By.xpath("//a[contains(text(),'Digital')]")).click();
		Thread.sleep(3000);	
		
		WebElement price = driver.findElement(By.xpath("//a[text()='3rd Album']/../../div[3]/div/span"));
		System.out.println(price.getText());
		
		WebElement price2 = driver.findElement(By.xpath("//a[text()='Music 2']/../../div[3]/div/span"));
		System.out.println(price2.getText());
		
		WebElement price3 = driver.findElement(By.xpath("//a[text()='Music 2']/../../div[3]/div/span"));
		System.out.println(price3.getText());
		
		Thread.sleep(3000);	
		driver.close();
	}
}
