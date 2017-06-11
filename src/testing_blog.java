import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class testing_blog {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://only-testing-blog.blogspot.in/2014/01/textbox.html");
		
		driver.manage().window().maximize();
		
		for  (int i = 1; i < 11 ;i++){
			String expMovie=".//*[@id='post-body-4292417847084983089']/div[1]/form[2]/table/tbody/tr/td[1]/select/option["+i+"]";
			driver.findElement(By.xpath(expMovie)).click();	
		}
		
	
		
		//driver.findElement(By.xpath(".//*[@id='post-body-4292417847084983089']/div[1]/form[2]/table/tbody/tr/td[1]/select")).click();
		
		driver.findElement(By.xpath(".//*[@id='post-body-4292417847084983089']/div[1]/form[2]/table/tbody/tr/td[2]/input[1]")).click();
		
		for  (int i = 1; i < 11 ;i++){
		
			String expMovie=".//*[@id='post-body-4292417847084983089']/div[1]/form[2]/table/tbody/tr/td[3]/select/option["+i+"]";
			driver.findElement(By.xpath(expMovie)).click();	
		}
		driver.findElement(By.xpath(".//*[@id='post-body-4292417847084983089']/div[1]/form[2]/table/tbody/tr/td[2]/input[2]")).click();
		
		driver.findElement(By.xpath(".//*[@id='radio1']")).click();
		
		WebElement radio_button = driver.findElement(By.xpath(".//*[@id='radio1']"));
		
		System.out.println("check if radio button is selected"+ radio_button.isSelected());
		System.out.println("check if radio button is selected"+ radio_button.isDisplayed());
		System.out.println("check if radio button is selected"+ radio_button.isEnabled());
		
		if ( radio_button.isSelected()){
			System.out.println("selected");}
			else {
				radio_button.click();
			}
		
		WebElement X = driver.findElement(By.xpath(".//*[@id='radio1']"));
		System.out.println(X.getAttribute("value"));
		
		System.out.println(driver.findElement(By.xpath(".//*[@id='Carlist']")).getText());		
		
		driver.close();
		
		String Y = X.getAttribute("value");
		
		System.out.println(Y);
		
		

	}

}
