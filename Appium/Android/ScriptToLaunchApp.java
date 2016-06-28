package test;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

public class FirstTest {
WebDriver driver;

@BeforeClass
public void setUp() throws MalformedURLException{
	DesiredCapabilities capabilities = new DesiredCapabilities();
	capabilities.setCapability("BROWSER_NAME", "Android");
	capabilities.setCapability("VERSION", "4.2.2"); 
	capabilities.setCapability("deviceName","HTC One X - 4.2.2 - API 17 - 720x1280");
	capabilities.setCapability("platformName","Android");
  capabilities.setCapability("appPackage", "com.guru99app"); //Can get this one when Appium is running
	capabilities.setCapability("appActivity",".MainActivity");
  driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
}

@Test
public void testCal() throws Exception {
   //Something inside
}

@AfterClass
public void teardown(){
	//close the app
	driver.quit();
}
}
