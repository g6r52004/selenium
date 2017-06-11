import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Day_06May {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		WebDriver driver = new FirefoxDriver();
		/*driver.get("https://www.pvrcinemas.com/");
		String expMovie="BAAHUBALI -THE CONCLUSION (Hindi)";
		driver.findElement(By.xpath("//button[@id='qb-movie']")).click();
		
		List<WebElement> allMovies = driver.findElements(By.xpath("//*[@id='qb-div-movie']/div/ul/li"));
		
		System.out.println(allMovies.size());
		
		for(int i=0;i<allMovies.size();i++){
			System.out.println(allMovies.get(i).getText());
			
			if(allMovies.get(i).getText().equals(expMovie)){
				allMovies.get(i).click();
			}
		}*/
		
		/*driver.get("http://newtours.demoaut.com");
		//How to maximize the browser window
		
		driver.manage().window().maximize();
		
		//Browser Navigation commands
		
		driver.navigate().to("http://google.com");
		
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		*/
		
		
		//How to handle Alerts
		
		//driver.get("http://only-testing-blog.blogspot.in/2014/01/textbox.html");
		
	/*	driver.findElement(By.xpath("//*[@id='post-body-4292417847084983089']/div[1]/input")).click();
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		alert.accept();*/
		
		/*driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();*/
		
		
		
		/*driver.findElement(By.xpath("//*[@id='post-body-4292417847084983089']/div[1]/button[2]")).click();
		Alert alert = driver.switchTo().alert();
		
		alert.sendKeys("sandeep");
		
		Thread.sleep(4000);
		
		alert.dismiss();*/
		
		/*
		
		driver.findElement(By.xpath("//*[@id='post-body-4292417847084983089']/div[1]/button[2]")).click();
		Alert alert = driver.switchTo().alert();
		
		alert.sendKeys("sandeep");
		
		Thread.sleep(4000);
		
		alert.accept();
		
		driver.findElement(By.xpath("//*[@id='post-body-4292417847084983089']/div[1]/button[2]")).click();
		alert = driver.switchTo().alert();
		
		alert.sendKeys("manoj");
		
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_SPACE);*/
		
		
		/*List<WebElement> rows = driver.findElements(By.xpath("//*[@id='post-body-4292417847084983089']/div[1]/table/tbody/tr"));
		System.out.println(rows.size());
		
		List<WebElement> cols = driver.findElements(By.xpath("//*[@id='post-body-4292417847084983089']/div[1]/table/tbody/tr[1]/td"));
		
		System.out.println(cols.size());
		
		for(int i=1;i<=rows.size();i++){
			for(int j=1;j<=cols.size();j++){
				System.out.print(driver.findElement(By.xpath("//*[@id='post-body-4292417847084983089']/div[1]/table/tbody/tr[" + i +"]/td[" + j +"]")).getText());
				System.out.print("\t");
			}
			System.out.println();
		}
		*/
		
		
		//Implicit Wait
		driver.get("http://newtours.demoaut.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		driver.findElement(By.name("password1")).sendKeys("tutorial");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
