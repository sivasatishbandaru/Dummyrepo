package hyrpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowns {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
	WebElement ssss =driver.findElement(By.id("course"));
	Select sel =new Select(ssss);
	sel.selectByVisibleText("Java");
	sel.selectByValue("net");
	sel.selectByIndex(4);
	WebElement sss =driver.findElement(By.id("ide"));
	Select sl =new Select(sss);
	
	
	}

	}


