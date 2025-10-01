package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadText {
	public static void main(String[]args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		
//		WebElement cart = driver.findElement(By.className("ico-cart"));
//		System.out.println((cart.getText()));
//		Thread.sleep(3000);
//		driver.close();
		
		String books= driver.findElement(By.linkText("Books")).getText();
		System.out.println(books);
		
		//*******This will not work becoz link text and partial link text only works for anchor tag and link tag not for text
		
//		WebElement poll = driver.findElement(By.partialLinkText("Community"));
//		System.out.println(poll.getText());
		
		
		
		
		Thread.sleep(3000);
		driver.close();
	}
}
