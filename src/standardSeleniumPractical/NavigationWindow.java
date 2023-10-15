package standardSeleniumPractical;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationWindow {

	public static void main(String[] args) throws InterruptedException {
		//setting up thirdparty properties in the class file
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse-workplace\\SQA_StandardSelenium\\Thirdparty__Resource_FIles\\Chrome Driver\\V117.exe");
		
		//define the web driver
		WebDriver driver = new ChromeDriver();
		
		//call the chrome browser and make the interface maximize in the pc
		driver.manage().window().maximize();

		//call the url in the browser
		driver.get("file:///C:/Users/user/Downloads/Navigation%20Windows.html");
		Thread.sleep(2000);
		
		//Identify webElements
		WebElement fname = driver.findElement(By.name("fname"));
		fname.sendKeys("Nadun");
		Thread.sleep(1000);
		WebElement lname = driver.findElement(By.name("lname"));
		lname.sendKeys("Bandara");
		Thread.sleep(1000);
		WebElement Option1radiobutton = driver.findElement(By.xpath("//*[@id=\"regForm\"]/div[1]/p[3]/input[1]"));
		WebElement Option2radiobutton = driver.findElement(By.xpath("//*[@id=\"regForm\"]/div[1]/p[3]/input[2]"));
		Thread.sleep(1000);
		
		String selectedOption = "Option1"; 

		if ("Option1".equals(selectedOption)) {
		    Option1radiobutton.click();
		    Thread.sleep(1000);
		} else {
		    Option2radiobutton.click(); 
		    Thread.sleep(1000);
		}
		
		WebElement nextbtn = driver.findElement(By.id("nextBtn"));
		nextbtn.click();
		Thread.sleep(3000);
		
		String Expected_url = "file:///C:/Users/user/Downloads/Navigation%20Windows.html";
		String Current_url = driver.getCurrentUrl();
		
		if(Expected_url.equals(Current_url)) {
			System.out.println("Urls are match");
			WebElement email = driver.findElement(By.name("email"));
			email.sendKeys("nadun@gmail.com");
			Thread.sleep(1000);
			WebElement phone = driver.findElement(By.name("phone"));
			phone.sendKeys("0715548963");
			Thread.sleep(1000);
			WebElement prevbtn = driver.findElement(By.id("prevBtn"));
			prevbtn.click();
			
		}
		else {
			System.out.println("Urls are not match");

		}
		
		
		
	}


}
