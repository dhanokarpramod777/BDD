package BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
public static WebDriver ChromeDriver() throws InterruptedException {
	
	  //  System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\SeleniumProject\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","src\\main\\resources\\Browser\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
	
	
//	    System.setProperty("webdriver.gecko.driver","src\\main\\resources\\Browser\\geckodriver.exe");
//	    WebDriver driver = new FirefoxDriver();
	     
		
     	driver.manage().window().maximize();
		driver.get("https://edu-dev-deletion.netlify.app/dashboard");
		return driver;
		
}

static ExtentHtmlReporter htmlReporter;
static ExtentReports report;
static ExtentTest test;

public static ExtentTest getTestForReporter(String useCase)
{
	
	return test = report.createTest(useCase);
}

public static ExtentHtmlReporter getHtmlReporter()
{
	if(htmlReporter == null)
	{
		htmlReporter = new ExtentHtmlReporter("ExtentReporter.html");
		
	}
	
	return htmlReporter;
}

public static ExtentReports getExtentReport()
{
	if(report == null)
	{
		report = new ExtentReports();
		report.attachReporter(htmlReporter);
	}
	
	return report;
}


}

