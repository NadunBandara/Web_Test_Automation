package standardSeleniumPractical;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebAutomation_Facebooklogin {

public static void main(String[] args) throws InterruptedException {
		
		//setting up thirdparty properties in the class file
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse-workplace\\SQA_StandardSelenium\\Thirdparty__Resource_FIles\\Chrome Driver\\V117.exe");
		
		//define the web driver
		WebDriver driver = new ChromeDriver();
		
		//call the chrome browser and make the interface maximize in the pc
		driver.manage().window().maximize();
		
		//call the url in the browser
		//driver.get("https://google.com/");
		//find web element using xpath
		//driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/textarea")).sendKeys("Facebook.com" + Keys.ENTER);
		//clcik the first search result
		//WebElement firstsearchresult = driver.findElement(By.xpath("/html/body/div[6]/div/div[9]/div[1]/div[2]/div[2]/div/div/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/h3"));
		//firstsearchresult.click();
		//waiting for the load results
		//Thread.sleep(3000);
		//click the search results the start in Facebook - log in or sign up
		//driver.findElement(By.linkText("Facebook - log in or sign up")).click();
		
	}

}
