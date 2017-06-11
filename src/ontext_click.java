import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class ontext_click {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://deluxe-menu.com/popup-mode-sample.html");
		
		WebElement img = driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/div[2]/table[1]/tbody/tr/td[3]/p[2]/img"));
		
		Actions action = new Actions(driver);
		action.contextClick(img).build().perform();
		action.moveToElement(driver.findElement(By.xpath(".//*[@id='dm2m1i1tdT']"))).build().perform();
		//action.moveToElement(driver.findElement(By.xpath(".//*[@id='dm2m2i0tdT']"))).click();
		driver.findElement(By.xpath(".//*[@id='dm2m2i0tdT']")).click();
		
		driver.close();
		

	}

}
