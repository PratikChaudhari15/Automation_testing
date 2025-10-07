package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		
		//*********** XPath By using Attribute***********
		
		//driver.findElement(By.xpath("//label[@for='pollanswers-1']")).click();
		//Thread.sleep(3000);
		
		//*********** XPath By using Text***********

//		WebElement poll = driver.findElement(By.xpath("//strong[text()='Community poll']"));
//		System.out.println(poll.getText());
//		Thread.sleep(3000);
		
		//***********By using Contains***********
		
		//driver.findElement(By.xpath("//input[contains(@id,'small-searchterms')]")).sendKeys("Computer");
		
		//***********XPath By using Group of Index***********
		
		//driver.findElement(By.xpath("(//input[@name='pollanswers-1'])[4]")).click();
		
		//***********XPath By using dependent Xpath***********
		WebElement Laptop14 = driver.findElement(By.xpath("//a[text()=14.1-inch Laptop']/../../div[3]/div/span"));
		System.out.println(Laptop14.getText());
		
		Thread.sleep(3000);
		driver.close();
	}

}
