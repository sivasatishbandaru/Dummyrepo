package hiii;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class satish {

	public static void main(String[] args) throws IOException {
		
				ChromeDriver driver =new ChromeDriver();
				driver.get("https://www.google.com/");
				driver.manage().window().maximize();
			
//				File
				File src = driver.getScreenshotAs(OutputType.FILE);
				File dst = new File("./screenshot/screen.png");
				FileUtils.copyFile(src, dst);
				
				
				driver.close();
				

	

	}

}
