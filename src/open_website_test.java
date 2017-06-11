import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.thoughtworks.selenium.webdriven.commands.Close;


public class open_website_test {

	public static void main(String[] args) {
	
		WebDriver driver = new FirefoxDriver();
		
		
		driver.get("http://newtours.demoaut.com");
		
		WebElement Username = driver.findElement(By.name("userName"));
		
		Dimension usernamesize = Username.getSize();
		
		System.out.println(usernamesize.getHeight());
		System.out.println(usernamesize.getWidth());
		
		
		Username.sendKeys("tutorial");
		
		
		
		driver.findElement(By.name("password")).sendKeys("tutorial");
		
		driver.findElement(By.name("login")).click();
		
		
		
		
		// using link text to find an element
		//driver.findElement(By.linkText("PROFILE")).click();
		//using partial link text
		driver.findElement(By.partialLinkText("ROFIL")).click();
		
			
		//dropdown 
		
		/*Select dropdown = new Select(driver.findElement(By.name("country")));
		
		dropdown.selectByVisibleText("INDIA");
		
		
		List<WebElement> alloptions = dropdown.getOptions();
		
		System.out.println(alloptions.size());
		
		for (int i = 0; i<alloptions.size();i++) {
			System.out.println(alloptions.get(i).getText());
			}*/
			
			
		
		
				
		
		System.out.println("entered the website");
		
driver.close();
	}

}
