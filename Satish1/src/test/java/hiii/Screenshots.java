package hiii;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshots {
	
		 
		public static void main(String[] args) throws IOException {
			 
			 
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.youtube.com/watch?v=DlhWLWzHPvw&list=PLacgMXFs7kl_7BbV1p_KqDYM65Zm4L_HU&index=16");
			driver.manage().window().maximize();
			
			if(driver instanceof FirefoxDriver) {
				
				//Full Page
				File fullPage = ((FirefoxDriver) driver).getFullPageScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(fullPage, new File("./screenshot/fullpage.png"));
				
				
			}else if(driver instanceof ChromeDriver) {
				
				
				File pageScreenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(pageScreenshot, new File("./screenshot/page.png"));
				
				
			}
			
	
		}
		}
		
	
	


