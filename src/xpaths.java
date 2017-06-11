import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class xpaths {

	public static void main(String[] args) {
		
WebDriver driver = new FirefoxDriver();

driver.get("http://newtours.demoaut.com");

//driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("tutorial");
driver.findElement(By.xpath("//input[@name='userName'][@type='text']")).sendKeys("tutorial");



/*
driver.navigate().to("https://paytm.com/");

driver.navigate().back();
driver.navigate().forward();
driver.navigate().refresh();

*/
driver.close();

	}

}

