package hiii;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

import org.openqa.selenium.Pdf;
import org.openqa.selenium.PrintsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.print.PageSize;
import org.openqa.selenium.print.PrintOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Printoptions {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com");
		PrintsPage printer = (PrintsPage) driver;
			
		PrintOptions printOptions = new PrintOptions();
		PageSize p=printOptions.getPageSize();
		printOptions.setPageRanges("1-2");
		Pdf pdf =  printer.print(printOptions);
		String content =pdf.getContent();
		System.out.println(content);
		FileOutputStream fos = new FileOutputStream("./screenshot/fullpage232.pdf");
		byte[] decoder = Base64.getDecoder().decode(content);
		fos.write(decoder);
		fos.close();

	}

}
