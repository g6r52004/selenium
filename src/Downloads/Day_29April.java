import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class Day_29April {

	public static void main(String[] args) {
		
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		//driver.findElement(By.partialLinkText("STER")).click();
		
		
		Select dropDown = new Select(driver.findElement(By.name("country")));
		
		//dropDown.selectByVisibleText("INDIA");
		
		//dropDown.selectByValue("92");
		
		//dropDown.selectByIndex(1);
		
		//driver.close();
		
		List<WebElement> allOptions = dropDown.getOptions();
		
		System.out.println(allOptions.size());
		
		for(int i=0;i<allOptions.size();i++){
			System.out.println(allOptions.get(i).getText());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
