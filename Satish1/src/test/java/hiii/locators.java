package hiii;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class locators {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
    driver.manage().window().maximize();
    
	}

}
