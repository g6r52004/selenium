import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;


public class Day_07May {
	//public static WebDriver driver=new FirefoxDriver;
	
	public static void main(String[] args) throws FindFailed, InterruptedException {
		
		
		
		WebDriver driver = new FirefoxDriver();
		/*driver.get("http://only-testing-blog.blogspot.in/2014/01/textbox.html");
		
		driver.findElement(By.xpath("//*[@id='post-body-4292417847084983089']/div[1]/form[1]/input[10]")).click();
		
		
		Pattern img1 = new Pattern("C:\\Softwares\\Training\\Img1.png");
		Pattern img2 = new Pattern("C:\\Softwares\\Training\\Img2.png");
		
		Screen screen = new Screen();
		
		screen.click(img1);
		screen.type("C:\\CaptureScreenshot.png");
		screen.click(img2);*/
		
		//How to use Explicit Wait
	/*	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com");
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("userName1")));
		
		//driver.findElement(By.name("password"));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("password")));
		
		driver.get("http://newtours.demoaut.com");
		Boolean isElementExists = driver.findElements(By.name("userName")).size()!=0;
		System.out.println(isElementExists);
		
		//difference between findElement and findElements
		
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.name("userName1")));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.name("userName")));
		*/
		
		
		//driver.get("http://newtours.demoaut.com");
		/*driver.quit();
		System.out.println(driver.getTitle());*/
		
		
		//driver.close and driver.quit
		
		//driver.switchTo().alert().accept();
		
		//driver.switchTo().frame("xyz");
		
		//driver.switchTo().window("window2");
		
		//StaleElementReferenceException
		
		/*driver.get("https://github.com/");
		
		WebElement search_box = driver.findElement(By.name("q"));
		
		search_box.sendKeys("hello");
		search_box.sendKeys(Keys.ENTER);
		
		Thread.sleep(4000);
		search_box = driver.findElement(By.name("q"));
		search_box.clear();
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
	/*public static boolean isElementExists(){

	
	try{
		driver.findElement(By.name("userName"));
		return true;
	}catch(NoSuchElementException e){
		return false;
	}
	}*/
}
