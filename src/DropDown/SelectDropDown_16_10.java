package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown_16_10 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/MY%20Files/Study/Qspider/demo.html");
		Thread.sleep(2000);
		WebElement singleSelect = driver.findElement(By.id("standard_cars"));
		Select sel = new Select(singleSelect);
		sel.selectByIndex(2);
		Thread.sleep(2000);
		sel.selectByVisibleText("Jaguar");
		Thread.sleep(2000);
		sel.selectByValue("vol");
		Thread.sleep(2000);
		sel.selectByValue("hda");
		
		Thread.sleep(2000);
		driver.close();
	}

}
