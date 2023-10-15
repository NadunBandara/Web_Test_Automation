package standardSeleniumPractical;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebAutomation_Instagramlogin {

	public static void main(String[] args) throws InterruptedException {
				//setting up thirdparty properties in the class file
				System.setProperty("webdriver.chrome.driver", "D:\\Eclipse-workplace\\SQA_StandardSelenium\\Thirdparty__Resource_FIles\\Chrome Driver\\V117.exe");
				
				//define the web driver
				WebDriver driver = new ChromeDriver();
				
				//call the chrome browser and make the interface maximize in the pc
				driver.manage().window().maximize();

				//call the url in the browser
				driver.get("https://www.instagram.com/");
				
				//get the loaded result
				String expected_title = "Instagram";
				String actual_title = driver.getTitle();
				
				//set 3 second break for the loading
				Thread.sleep(3000);
				
				//check the title
				if(expected_title.equals(actual_title)) {
					//find the username text box
					WebElement username = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div/div[1]/section/main/article/div[2]/div[1]/div[2]/form/div/div[1]/div/label/input"));
					username.sendKeys("nadun");
					
					//set 1 second break for the loading
					Thread.sleep(1000);
					
					//find the password text box
					WebElement password = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div/div[1]/section/main/article/div[2]/div[1]/div[2]/form/div/div[2]/div/label/input"));
					password.sendKeys("nadun1");
					
					//find the loging button
					WebElement login_button = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div/div[1]/section/main/article/div[2]/div[1]/div[2]/form/div/div[3]"));
					login_button.click();
					
					//set 3 second break for the loading
					Thread.sleep(3000);
					
					//set the expected and actual url
					String expected_title1 = "Help us confirm it's you • Instagram";
					String actual_title1 = driver.getTitle();
					
					//check the urls
					if(expected_title1.equals(actual_title1)) {
						System.out.println("Pass the first case");
						
						//set 3 second break for the loading
						Thread.sleep(3000);
						
						//go back to the previous page
						driver.navigate().back();
						
						//set 3 second break for the loading
						Thread.sleep(3000);
						
						/*//use facebook login for the log instagram
						WebElement facebook_login = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[5]"));
						facebook_login.click();*/
						
						WebElement username1 = driver.findElement(By.name("username"));
						username1.sendKeys("_nadun_j");
						
						//set 1 second break for the loading
						Thread.sleep(1000);
						
						//find the password text box
						WebElement password1 = driver.findElement(By.name("password"));
						password1.sendKeys("Nadun@JND@#");
						
						//set 1 second break for the loading
						Thread.sleep(1000);
						
						//find the loging button
						WebElement login_button1 = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]/button"));
						login_button1.click();
						
						//set 3 second break for the loading
						Thread.sleep(3000);
						
						//get the profile title
						String profile_title = "Instagram";
						String Real_title = driver.getTitle();
						
						//check the profile title
						if(profile_title.equals(Real_title)) {
							System.out.println("Pass the second case");
							
							//set 3 second break for the loading
							Thread.sleep(3000);
							
							//close the browser
							driver.close();
							}
						else {
							System.out.println("There is an issue in profile title");
						}
						
					}else {
						System.out.println("There is ans issue in title");
					}
				}else {
					System.out.println("Incorrect");
				}
				
	}

}
