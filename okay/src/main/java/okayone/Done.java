package okayone;

import org.openqa.selenium.chrome.ChromeDriver;


public class Done {
	public static ChromeDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Drivers/" + "chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.get("");

	}

}
