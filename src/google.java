import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class google {

	public static void main(String[] args) {
	
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.co.in/?gfe_rd=cr&ei=hs4PWcOoE4XI8AehnKuoDQ&gws_rd=ssl#q=hello");
		
		driver.manage().window().maximize();
		
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		
		System.out.println(alllinks.size());
		
		for ( int i = 0; i < alllinks.size() ; i++){
			
			System.out.println(alllinks.get(i).getText()+"->"+alllinks.get(i).getAttribute("href"));
		}
		
			
		driver.close();
		

	}

}
