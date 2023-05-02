package hyrpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class kk {

	public static void main(String[] args) {	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/");
		driver.findElement(By.xpath("//*[@id=\"post-2715\"]/div[2]/div/div/div[2]/div[2]/ul/li[5]/a")).click();
        WebElement ssss=driver.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select"));
        ssss.click();
        Select ss=new Select(ssss);
        ss.selectByIndex(4);
        ss.deselectAll();
    
	}
	

}
