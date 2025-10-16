package Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountOfTag_15_10 {

	public static void main(String[]args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		List<WebElement> tag = driver.findElements(By.xpath("//input"));
		System.out.print("tag count:  " +(tag.size()+1));
	}
}
