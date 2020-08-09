import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenGoogle {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		WebDriver driver=null;
		FileInputStream file=new FileInputStream("Config.properties");
		Properties property=new Properties();
		property.load(file);
		String browser=property.getProperty("browser");
		String driverlocation=property.getProperty("driverlocation");
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			
				System.setProperty("webdriver.chrome.driver", driverlocation);
				 driver=new ChromeDriver();	
				
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", driverlocation);
			 driver=new FirefoxDriver();
		}
		     
				driver.get("https://www.google.co.in");
				driver.close();
	}

}
