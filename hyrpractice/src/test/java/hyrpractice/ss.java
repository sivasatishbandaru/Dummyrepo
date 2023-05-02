package hyrpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


	public class ss{
		   public static void main(String[] args) {
		      System.setProperty("webdriver.gecko.driver",
		         "C:\Users\ghs6kor\Desktop\Java\geckodriver.exe");
		      WebDriver driver = new FirefoxDriver();
		      //implicit wait
		      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		      //maximize browser
		      driver.manage().window().maximize();
		      //URL launch
		      driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		      //identify dropdown
		      WebElement d= driverfindElement(By.xpath("//select[@name='selenium_commands']"));

		      //object of Select class
		      Select s=new Select(d);
		      //get options of dropdown in list
		      List t =s.getOptions();
		      System.out.println("Options are: ");
		      for (WebElement i: t){
		         System.out.println(i.getText());
		      }
		      //return true if multi-select dropdown
		      Boolean b=s.isMultiple();

		      System.out.println("Boolen value for drodown: "+ b);
		      //select item by index
		      s.selectByIndex(2);
		      Thread.sleep(1000);
		      //select item by visible text
		      s.selectByVisibleText("Wait Commands");
		      Thread.sleep(1000);
		      //get first selected option in dropdown
		      WebElement f = s.getFirstSelectedOption();
		      System.out.println("First selected option is: "+ f.getText());
		      //deselect option by index
		      s.deselectByIndex(2);
		      Thread.sleep(1000);
		      //deselect all selected items
		      s.deselectAll();
		      driver.close();
		   }
		}
}

	