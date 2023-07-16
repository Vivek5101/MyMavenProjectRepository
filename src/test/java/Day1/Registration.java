package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Registration {
  @Test
  public void register1() throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
	  ChromeOptions options=new ChromeOptions();
	  options.addArguments("--remote-allow-origin=*");
	  
	  WebDriver driver=new ChromeDriver(options);
	  driver.manage().window().maximize();
	  
	  Thread.sleep(2000);
	  
	  driver.get("https://www.google.com");
	  System.out.println("This is Registration one");
  }
  
  @Test
  public void register2() {
	  System.out.println("This is Registration two");
  }
}
