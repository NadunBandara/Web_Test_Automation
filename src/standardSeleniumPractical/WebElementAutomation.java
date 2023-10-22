package standardSeleniumPractical;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElementAutomation {

	public static void main(String[] args) {
				//setting up thirdparty properties in the class file
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse-workplace\\SQA_StandardSelenium\\Thirdparty__Resource_Flles\\Chrome Driver\\V117.exe");

				
				//define the web driver
				WebDriver driver = new ChromeDriver();
				
				//call the chrome browser and make the interface maximize in the pc
				driver.manage().window().maximize();
				
				//call the url in the browser
				driver.get("file:///C:/Users/user/Downloads/Selenium%20Web%20Controllers.html");
				
				//identify the web elements - radio buttons
				WebElement Option1radiobutton = driver.findElement(By.id("vfb-7-1"));
				WebElement Option2radiobutton = driver.findElement(By.id("vfb-7-2"));
				WebElement Option3radiobutton = driver.findElement(By.id("vfb-7-3"));
				
				String selectedOption = "Option2"; 

				if ("Option1".equals(selectedOption)) {
				    Option1radiobutton.click();
				} else if ("Option2".equals(selectedOption)) {
				    Option2radiobutton.click(); 
				} else {
				    Option3radiobutton.click(); 
				}
				
				//Identify the check box
				WebElement Checkbox1 = driver.findElement(By.id("vfb-6-0"));
				WebElement Checkbox2 = driver.findElement(By.id("vfb-6-1"));
				WebElement Checkbox3 = driver.findElement(By.id("vfb-6-2"));
				
				//click the check box
				Checkbox1.click();
				Checkbox2.click();
				
				//sample logic
				if (Checkbox1.isSelected() && Checkbox2.isSelected()) {
					System.out.println("Selected check box 1 and 2");
				}
				else {
					System.out.println("Selected another check box");
				}
				
				//Identify the combo box
				Select fruits = new Select(driver.findElement(By.id("fruits")));
				
				//First method to identify the value - by visble text
				fruits.selectByVisibleText("Banana");
				System.out.println("By visible text - Banana");
				
				//Second methos - by id
				fruits.selectByIndex(2);
				System.out.println("By index - Orange");
				
				//Indentify the dropdown
				Select country = new Select(driver.findElement(By.name("country")));
				//Trigger action
				country.selectByVisibleText("ALBANIA");
				System.out.println("Select ALBANIA");
				
				//Identify the submit button
				WebElement submit = driver.findElement(By.name("submit"));
				
				//Trigged action
				submit.click();
				System.out.println("Enter the submit button");
				
				//Identify the Textbox
				WebElement textbox = driver.findElement(By.name("userName"));
				
				//Trigged action
				textbox.sendKeys("Sample text has been added");
				System.out.println("Sample text has been added");
				
				//Identify the linktext
				driver .findElement(By.linkText("your destination")).click();
				System.out.println("Click the hyper link");
				
//				//Identify the table
//				//columns
//				List<WebElement> columns = driver.findElements(By.xpath("/html/body/table/tbody/tr"));
//				System.out.println("Column count:" + columns.size());
//				
//				//rows
//				List<WebElement> rows = driver.findElements(By.xpath("/html/body/table/tbody/tr/td"));
//				System.out.println("Row count:" + rows.size());
//				
//				//Retrieving a cell value
//				WebElement baseTable = driver.findElement(By.tagName("table"));
//				WebElement tableRowText = baseTable.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[3]"));
//				String cellValue = tableRowText.getText();
//				System.out.println("The cell value is: "+ cellValue);
				
				//Retrieving number of columns in the table
				List<WebElement> columns = driver.findElements(By.xpath("/html/body/table/tbody/tr"));
				System.out.println("Column count:" + columns.size());
				
				//Retrieving number of rows in the table
				List<WebElement> rows = driver.findElements(By.xpath("/html/body/table/tbody/tr[2]/td"));
				System.out.println("Row count:" + rows.size());
				
				//Retrieving a cell value
				WebElement baseTable = driver.findElement(By.tagName("table"));
				WebElement tableRowText = baseTable.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[3]"));
				String cellValue = tableRowText.getText();
				System.out.println("The cell value is: "+ cellValue);
	}

}
