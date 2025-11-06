package Action_Class;

import java.awt.Desktop.Action;

import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.java.swing.action.AboutAction;

public class tab_sendkeys {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		Action act = new Action(driver);
		
	}

}
