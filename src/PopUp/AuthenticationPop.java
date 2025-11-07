package PopUp;

import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPop {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin:admin@basic-auth-git-main-shashis-projects-4fa03ca5.vercel.app/w");

	}

}
