package Synchronazation;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HW_08_11_explicit_wait {
	
//	•	Omayo.blogspot.com
//	•	After entering scroll down the page
//	•	Retrieve the text of" text will be displayed with delayed" 
//	•	After retrieving refresh the page. After refresh
//	•	Click timer enable button
//	•	After clicking you'll get popup click that popup i.e handle the pop.
//	•	Close the browser.
//	•	Condition - thread.sleep should not be used

	public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement delayedText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("delayedText")));

        System.out.println("Displayed text: " + delayedText.getText());

        driver.navigate().refresh();

        WebElement timerButton = wait.until(ExpectedConditions.elementToBeClickable( By.id("timerButton") ));
        timerButton.click();
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        System.out.println("Alert text: " + alert.getText());
        alert.accept();

//        driver.quit();
    }
	

}
