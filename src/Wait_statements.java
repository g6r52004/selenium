import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Wait_statements {
//public static 	WebDriver driver = new FirefoxDriver();
	public static void main(String[] args) {
	
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://newtours.demoaut.com");
		
		//Explicit wait
WebDriverWait Wait	= new WebDriverWait(driver, 20);
Wait.until(ExpectedConditions.presenceOfElementLocated(By.name("userName")));

  Boolean isElementExists = driver.findElements(By.name("userName")).size()!=0;
//Boolean isElementExists = driver.findElements(By.name("userName")).size()!=0;
  System.out.println(isElementExists);
driver.close();

	}
	public static boolean isElementExists(){
		try {
			driver.findElement(By.name("userName"));
			return true;
			}
			catch(NoSuchElementException e) {
				return false;
					
		}
	}
}

