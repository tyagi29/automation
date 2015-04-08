package pompackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class pomlogin
{

	WebDriver driver=null;
	public void loginpage()
	{
		driver=new FirefoxDriver();
		driver.get("http://www.nature.com/");
		driver.findElement(By.className("login")).click();
		driver.findElement(By.id("login-username")).sendKeys("ravikant.tyagi@adi-mps.com");
		driver.findElement(By.id("login-password")).sendKeys("4321qwer");
		driver.findElement(By.id("login-submit")).click();
		driver.findElement(By.className("logoff")).click();
		driver.close();
		
	}
}
