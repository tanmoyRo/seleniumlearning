package mypackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

public class GoToURL {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\metan\\eclipse-workspace\\SeleniumLearning\\selenium-java-3.141.59\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseurl="https://www.google.com";
		driver.get(baseurl);
		String title=driver.getTitle();
		driver.close();
		System.out.println(title);
		
	}

}
