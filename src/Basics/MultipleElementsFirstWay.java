package Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElementsFirstWay {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		//************This the First Way******************
//		List<WebElement>community_poll = driver.findElements(By.name("pollanswers-1"));
//		for(WebElement web : community_poll)
//		{
//			web.click();
//			Thread.sleep(2000);
//		}
//		Thread.sleep(2000);
//		driver.close();
		
		//************This the Second Way******************
		
		List<WebElement> links = driver.findElements(By.xpath("//div[@class='header-links']/ul/li/a"));
		for(int i = 0;i<links.size();i++)
		{
			links.get(i).click();
			links = driver.findElements(By.xpath("//div[@class='header-links']/ul/li/a"));
			Thread.sleep(2000);
		}
		Thread.sleep(2000);
		driver.close();
	}

}
