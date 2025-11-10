package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RedBus_Date_08_11 {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disabled-notifications");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		Thread.sleep(2000);
		WebElement FromRoute = driver.findElement(By.xpath("//div[text()='From']"));
		FromRoute.click();
		FromRoute.sendKeys("Pune");
		Thread.sleep(2000);
		driver.close();
	}
}
