package variousConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {

		// System.setProperty("webdriver.chrome.driver",
		// "/Users/yuvaraj/eclipse21_Workspace/mavenproject/crm/driver/chromedriver.exe");
		// System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "/Users/yuvaraj/Downloads/chromedriver-mac-arm64/chromedriver");
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");

	}
}
