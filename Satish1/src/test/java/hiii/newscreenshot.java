package hiii;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class newscreenshot {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
//		File pageScreenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(pageScreenshot, new File("./screenshot/page2.png"));
		File src = driver.getScreenshotAs(OutputType.FILE);
		File d = new File("./screenshot/page23.png");
		FileUtils.copyFile(src, d);
		
	}

}
