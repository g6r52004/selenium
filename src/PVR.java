import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class PVR {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.pvrcinemas.com/");
		
		driver.manage().window().maximize();
		
		//to get list of all movies with variable as input
		driver.findElement(By.id("qb-movie")).click();;
		
		String expmovie = "SONATA (ENGLISH)";
		
		List<WebElement> alloptions = driver.findElements(By.xpath(".//*[@id='qb-div-movie']/div/ul/li"));
		
		System.out.println(alloptions.size());
		
		for (int i = 0; i < alloptions.size() ; i++){
			if (alloptions.get(i).getText().equals(expmovie) )
			System.out.println(alloptions.get(i).getText());
		}
		
		
		System.out.println(" entered the website");
		driver.close();
		
	}

}
