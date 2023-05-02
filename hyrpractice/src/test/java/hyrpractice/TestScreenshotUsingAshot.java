package hyrpractice;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class TestScreenshotUsingAshot {

public static void main(String[] args) throws IOException {
	
System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
WebDriver driver  = new ChromeDriver();	

driver.get("https://demo.guru99.com/test/guru99home/");
driver.manage().window().maximize();
		
Screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);

ImageIO.write(screenshot.getImage(), "jpg", new File("C:\\Users\\siva satish\\OneDrive\\Desktop\\mani\\hyrpractice\\Screenshots.jpg"));
	
	}

}