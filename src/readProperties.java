import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class readProperties {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("C:\\SeleniumCoaching\\MyFirstWebDriverProject\\src\\OR.properties");
		Properties prop = new Properties();
		
		prop.load(fis);
		
		System.out.println(prop.getProperty("un"));
		System.out.println(prop.getProperty("pwd"));
		
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		
		//driver.findElement(By.name("userName")).sendKeys("tutorial");
		
		driver.findElement(By.name(prop.getProperty("un"))).sendKeys("tutorial");
		driver.findElement(By.name(prop.getProperty("pwd"))).sendKeys("tutorial");
		
		//findElement("username").senkeys("tutorial");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
