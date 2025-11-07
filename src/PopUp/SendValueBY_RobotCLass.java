package PopUp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import UtilityClass.BaseClass;
public class SendValueBY_RobotCLass extends BaseClass{

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		Robot bot = new Robot();
		driver.findElement(By.id("small-searchterms")).click();
		bot.keyPress(KeyEvent.VK_P);
		Thread.sleep(1000);
		bot.keyPress(KeyEvent.VK_E);
		Thread.sleep(1000);
		bot.keyPress(KeyEvent.VK_N);
		Thread.sleep(1000);
		
		bot.keyRelease(KeyEvent.VK_P);
		bot.keyRelease(KeyEvent.VK_E);
		bot.keyRelease(KeyEvent.VK_N);
		
		postCondition2();
		
	}

}
