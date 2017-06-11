import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class launch_website {

	public static void main(String[] args) {
		WebDriver driver  = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		/*driver.findElement(By.name("userName")).sendKeys("tutorial");
		driver.findElement(By.name("password")).sendKeys("tutorial");
		driver.findElement(By.name("login")).click();
		driver.close();*/
WebElement username = driver.findElement(By.name("userName"));
WebElement password =driver.findElement(By.name("password"));
WebElement login = driver.findElement(By.name("login"));
username.sendKeys("tutorial");

password.sendKeys("tutorial");
login.click();

Select dropdown = new Select(driver.findElement(By.name("passCount")));

dropdown.selectByVisibleText("2");

List<WebElement> allentries = dropdown.getOptions();

System.out.println(allentries.size());

for (int i = 0; i < allentries.size();i++){
	
	System.out.println(allentries.get(i).getText());
}
driver.close();
	}

}
