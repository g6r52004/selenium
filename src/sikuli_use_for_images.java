import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;


public class sikuli_use_for_images {

	public static void main(String[] args) throws FindFailed {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://only-testing-blog.blogspot.in/2014/01/textbox.html");
		
		Pattern Img1 = new Pattern("C:\\Users\\I037663\\Documents\\selenium\\capture_browser.PNG");
		Pattern Img2 = new Pattern("C:\\Users\\I037663\\Documents\\selenium\\cancel.PNG");
		
		Screen Screen = new Screen();
		
		Screen.click(Img1);
		Screen.click(Img2);
		System.out.println("great");
	
driver.close();
	}

}
