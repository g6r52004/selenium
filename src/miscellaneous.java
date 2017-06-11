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
import org.openqa.selenium.firefox.FirefoxDriver;


public class miscellaneous {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		//driver.get("http://newtours.demoaut.com");
		
		//WebElement Username = driver.findElement(By.name("userName"));
		
		//how to get width and height of the field
		/*Option 1
		Dimension usernamesize = Username.getSize();
		
		System.out.println(usernamesize.getHeight());
		
		System.out.println(usernamesize.getWidth());
		
		System.out.println(usernamesize.getWidth());*/
		
		//Option2
		//System.out.println(Username.getSize().getHeight());
		
		
		//how get the coordinates 
	//Point Userlocation =	Username.getLocation();
	
	/*System.out.println(Userlocation.getX());
	System.out.println(Userlocation.getY());
	
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());*/
	//System.out.println(driver.getPageSource());
	
	/*String acttitle = driver.getTitle();
	String exptitle = "Welcome: Mercury Tours";
	
	if ( acttitle.contentEquals(exptitle)){
		System.out.println("Validation pass");
	}
	else
	{System.out.println("Validation failed");
		
	}*/
	
		
		driver.get("http://only-testing-blog.blogspot.in/2014/01/textbox.html");
		
		List <WebElement> rows = driver.findElements(By.xpath(".//*[@id='post-body-4292417847084983089']/div[1]/table/tbody/tr"));
		
		System.out.println(rows.size());
		
		List <WebElement> clos = driver.findElements(By.xpath(".//*[@id='post-body-4292417847084983089']/div[1]/table/tbody/tr[1]/td"));
		System.out.println(clos.size());
		
		int i= 1;
		int j = 1;
		for ( i = 1; i<=rows.size();i++)
			for ( j = 1; j<=clos.size();j++)
				
				if (j == 1)
	System.out.println(driver.findElement(By.xpath(".//*[@id='post-body-4292417847084983089']/div[1]/table/tbody/tr["+i+"]/td["+j+"]")).getText());
				else 
					System.out.print(driver.findElement(By.xpath(".//*[@id='post-body-4292417847084983089']/div[1]/table/tbody/tr["+i+"]/td["+j+"]")).getText());
	driver.close();
	
	

	}

/*
		
	File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	//FileUtils.copyFile(srcfile, new File("C:\\captureImange.png"));
	

*/









/*public static boolean verify message(String expvalue, string actvalue){
	if (expvalue.contentEquals(actvalue))*/
}
