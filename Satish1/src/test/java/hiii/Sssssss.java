package hiii;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sssssss {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver d =new ChromeDriver();
		d.get("https://meet.google.com/nsc-ihwe-ptr");
		File src =  d.getScreenshotAs(OutputType.FILE);
		File dd = new File("./screenshot/fullpage.png");FileUtils.copyFile(src, dd);
		
		d.close();
		
		/*public class Screen {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	
//		File
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dst = new File("./Screen/screen.png");
		FileUtils.copyFile(src, dst);
		
		
		driver.close();
		

	}

}	*/	
		
	}
}
		