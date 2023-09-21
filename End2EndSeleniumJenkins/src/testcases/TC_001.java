package testcases;

import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_001 {
	
	@Test
	public void testcase1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://pl-pl.facebook.com/");
		Thread.sleep(2000);
		driver.findElementByXPath("//html/body/div[3]/div[2]/div/div/div/div/div[4]/button[1]").click();
		driver.findElementById("email").sendKeys("Hello");
		driver.findElementById("pass").sendKeys("Hello");
		driver.quit();
	}

}
