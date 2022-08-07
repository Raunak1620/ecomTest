package ecomTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class helloSelnm {
    @Test
	public void demo() {


		System.setProperty("webdriver.chrome.driver", "C:\\InstallApp\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		}

}
