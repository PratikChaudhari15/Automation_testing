package Action_Class;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class register_WO_Findelement {
		public static void main(String[] args) throws InterruptedException {
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/");
			Thread.sleep(2000);
			Actions act = new Actions(driver);
			act.keyDown(Keys.TAB).perform();
			Thread.sleep(2000);
			act.keyDown(Keys.TAB).keyDown(Keys.ENTER).perform();
			Thread.sleep(2000);
			
			for(        )
			
			
			Thread.sleep(2000);
			driver.close();
		}
}
