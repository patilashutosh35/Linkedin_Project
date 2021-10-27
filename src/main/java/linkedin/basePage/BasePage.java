package linkedin.basePage;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasePage {
	public WebDriver driver;

	public void openBrowser(String browserName, String url) {
		if (browserName == "chrome") {
			System.setProperty("webdriver.chrome.driver", "C:\\SEdrivers\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browserName == "firefox") {
			System.setProperty("webdriver.gecko.driver", "C:\\SEdrivers\\geckodriver.exe");
			driver = new FirefoxDriver();

		} else if (browserName == "edge") {
			System.setProperty("webdriver.edge.driver", "C:\\SEdrivers\\msedgedriver.exe");
			driver = new EdgeDriver();

		}
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public String getData(String key) throws Exception {
		File file = new File("./src/test/Resources/LoginData.properties");
		FileInputStream f = new FileInputStream(file);
		Properties p= new Properties();
		p.load(f);
		return p.getProperty(key);
	}

}
