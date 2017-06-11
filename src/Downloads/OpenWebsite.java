import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class OpenWebsite {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://newtours.demoaut.com");
		
		/*driver.findElement(By.name("userName")).sendKeys("tutorial");
		driver.findElement(By.name("password")).sendKeys("tutorial");
		
		driver.findElement(By.name("login")).click();*/
		
		
		WebElement username = driver.findElement(By.name("userName"));
		WebElement password = driver.findElement(By.name("password"));
		WebElement login = driver.findElement(By.name("login"));
		username.sendKeys("tutorial");		
		password.sendKeys("tutorial");		
		login.click();
		
		
		
		
		
		
		

	}

}
