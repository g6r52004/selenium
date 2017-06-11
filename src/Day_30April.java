import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;


public class Day_30April {
	
	public static void main(String[] args) throws IOException {
		/*
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\SW\\seleniumserver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com");*/
		
		/*System.setProperty("webdriver.ie.driver", "C:\\Softwares\\SW\\seleniumserver\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://newtours.demoaut.com");
		*/
		
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://newtours.demoaut.com");
		/*driver.findElement(By.name("userName")).sendKeys("tutorial");
		driver.findElement(By.name("password")).sendKeys("tutorial");
		driver.findElement(By.name("login")).click();*/
		
		/*WebElement radio_box = driver.findElement(By.xpath("//input[@value='oneway']"));
		
		System.out.println("Check whether radio button is selected or not -> " + radio_box.isSelected());
		System.out.println("Check whether radio button is displayed or not -> " + radio_box.isDisplayed());
		System.out.println("Check whether radio button is enabled or not -> " + radio_box.isEnabled());
		driver.findElement(By.xpath("//input[@value='oneway']")).click();
		
		System.out.println("Check whether radio button is selected or not -> " + radio_box.isSelected());
		System.out.println("Check whether radio button is displayed or not -> " + radio_box.isDisplayed());
		System.out.println("Check whether radio button is enabled or not -> " + radio_box.isEnabled());
		
		if(radio_box.isSelected()){
			System.out.println("Radio button is already selected");
		}else{
			radio_box.click();
		}*/
		
		/*driver.findElement(By.name("findFlights")).click();
		driver.findElement(By.name("reserveFlights")).click();
		
		WebElement check_box = driver.findElement(By.name("ticketLess"));
		
		System.out.println(check_box.isSelected());
		System.out.println(check_box.isDisplayed());
		System.out.println(check_box.isEnabled());
		
		if(check_box.isSelected()){
			System.out.println("It is already checked");
		}else{
			check_box.click();
		}
		
		

		System.out.println(check_box.isSelected());
		System.out.println(check_box.isDisplayed());
		System.out.println(check_box.isEnabled());
		
		if(check_box.isSelected()){
			System.out.println("It is already checked");
		}else{
			check_box.click();
		}
*/		
		
		/*driver.get("http://only-testing-blog.blogspot.in/2014/01/textbox.html");
		
		System.out.println(driver.findElement(By.xpath("//*[@id='Blog1']/div[1]/div/h2/span")).getText());
		
		WebElement check_box = driver.findElement(By.xpath("//*[@id='check3']"));
		
		System.out.println(check_box.getAttribute("type"));
		System.out.println(check_box.getText());
		
		String x = check_box.getAttribute("type");*/
		
		
		//Count No of Links and print it
		
	/*	driver.get("http://newtours.demoaut.com");
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		System.out.println(allLinks.size());
		
		for(int i=0;i<allLinks.size();i++){
			System.out.println(allLinks.get(i).getText() + " -> " + allLinks.get(i).getAttribute("href"));
		}*/
		
		
		/*List<WebElement> allRadioBtn = driver.findElements(By.name("tripType"));
		
		allRadioBtn.get(1).click();*/
		
		/*WebElement username = driver.findElement(By.name("userName"));
		
		Dimension usernamesize = username.getSize();
		
		System.out.println(usernamesize.getHeight());
		System.out.println(usernamesize.getWidth());
		
		System.out.println(username.getSize().getHeight());
		System.out.println(username.getSize().getWidth());
		
		Point usernamelocation= username.getLocation();
		
		System.out.println(usernamelocation.getX());
		System.out.println(usernamelocation.getY());
		
		
		System.out.println(username.getLocation().getX());
		System.out.println(username.getLocation().getY());*/
		
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getPageSource());
		
		
		String actTitle = driver.getTitle();
		
		String expTitle = "Welcome: Mercury Tours";
		
		if(actTitle.contentEquals(expTitle)){
			System.out.println("Validation passed");
		}else{
			System.out.println("validation failed");
		}

		
		
		Day_30April.verifyMessages(expTitle, driver.getTitle());
		
		//Capture screenshot
		
		File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(srcfile, new File("C:\\captureImange.png"));
		
		Select dropDown = new Select(driver.findElement(By.xpath("//*[@id='Carlist']")));
		
		
		dropDown.getFirstSelectedOption();
		dropDown.getAllSelectedOptions();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	public static boolean verifyMessages(String expValue, String actValue){
		if(expValue.contentEquals(actValue)){
			System.out.println("Test passed");
			return true;
		}else{
			System.out.println("Test failed");
			return false;
		}
	}

}
