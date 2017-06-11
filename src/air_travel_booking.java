import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

//import com.sun.jna.platform.FileUtils;


public class air_travel_booking {

	public static WebDriver driver = new FirefoxDriver();
	public static void main(String[] args) throws IOException {
		
		
		
		driver.get("http://newtours.demoaut.com");
		
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		
		driver.findElement(By.name("password")).sendKeys("tutorial");
		
		driver.findElement(By.name("login")).click();
		
		driver.findElement(By.xpath("//input[@value='oneway']")).click();
		
		Select dropdown = new Select(driver.findElement(By.name("passCount")));
		
		dropdown.selectByValue("4");
		selectValueFromDropDown("fromPort", "Frankfurt");
		/*Select dropdown1 = new Select(driver.findElement(By.name("fromPort")));
		
		dropdown1.selectByValue("Frankfurt");
		*/
		Select dropdown2 = new Select(driver.findElement(By.name("fromMonth")));
		dropdown2.selectByValue("5");
		
		Select dropdown3 = new Select(driver.findElement(By.name("fromDay")));
		dropdown3.selectByValue("13");
		Select dropdown4 = new Select(driver.findElement(By.name("toPort")));
		dropdown4.selectByValue("New York");
		Select dropdown5 = new Select(driver.findElement(By.name("toMonth")));
		dropdown5.selectByValue("5");
		Select dropdown6 = new Select(driver.findElement(By.name("toDay")));
		dropdown6.selectByValue("15");
		
		driver.findElement(By.name("findFlights")).click();
		
		driver.findElement(By.xpath("//input[@value='Blue Skies Airlines$361$271$7:10']")).click();
		driver.findElement(By.xpath("//input[@value='Pangea Airlines$632$282$16:37']")).click();
		driver.findElement(By.name("reserveFlights")).click();
		driver.findElement(By.name("passFirst0")).sendKeys("hello0");
		driver.findElement(By.name("passLast0")).sendKeys("hi0");
		driver.findElement(By.name("passFirst1")).sendKeys("hello1");
		driver.findElement(By.name("passLast1")).sendKeys("hi1");
		driver.findElement(By.name("passFirst2")).sendKeys("hello2");
		driver.findElement(By.name("passLast2")).sendKeys("hi2");
		driver.findElement(By.name("passFirst3")).sendKeys("hello3");
		driver.findElement(By.name("passLast3")).sendKeys("hi3");
		driver.findElement(By.name("creditnumber")).sendKeys("1111");
		
		driver.findElement(By.name("buyFlights")).click();
		
		System.out.println(driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[5]/td/table/tbody/tr[12]/td/table/tbody/tr[2]/td[2]/font/b/font/font/b/font")).getText());
		
		
		File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(srcfile, new File("C:\\Users\\I037663\\Desktop\\capture.png"));
		
		
		driver.close();
		
		
		
	}
	
	public static void selectValueFromDropDown(String element, String strvalue){
		Select dropDown = new Select(driver.findElement(By.name(element)));
		dropDown.selectByValue(strvalue);
	}

}
