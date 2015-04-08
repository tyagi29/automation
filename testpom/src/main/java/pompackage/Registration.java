package pompackage;

//import  org.junit.Assert.*;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration {

	WebDriver driver = null;

	public  void regpage() throws InterruptedException {
		final long rnum = randomNumberGenerator();
		String email = "user" + rnum + "@mailinator.com";
		driver = new FirefoxDriver();
		driver.get("http://test-www.nature.com/");
		driver.findElement(By.xpath("//a[@title='Register with Nature.com']")).click();
		driver.findElement(By.id("firstname")).sendKeys("ravikant");
		driver.findElement(By.id("lastname")).sendKeys("tyagi");
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("password")).sendKeys("qwer1234");
		driver.findElement(By.id("passwordConfirm")).sendKeys("qwer1234");
		driver.findElement(By.id("agreeToTerms")).click();
		driver.findElement(By.id("company")).sendKeys("mps");
		Select drpjobtitle = new Select(driver.findElement(By.name("position")));
		drpjobtitle.selectByVisibleText("Journalist");
		Select drpjobtitle1 = new Select(driver.findElement(By.name("place")));
		drpjobtitle1.selectByVisibleText("Biotechnology");
		Select drpjobtitle2 = new Select(driver.findElement(By.name("field")));
		drpjobtitle2.selectByVisibleText("Biology");
		// driver.manage().timeouts().setScriptTimeout(15, TimeUnit.SECONDS);
		// ensure().element(By.name("firstspeciality")).seconds(15);
		Thread.sleep(3000);
		Select drpjobtitle3 = new Select(driver.findElement(By
				.name("primarySpecialty")));
		drpjobtitle3.selectByVisibleText("Biochemistry");
		driver.findElement(By.className("form-submit")).click();
		driver.close();
		
	}

	public long randomNumberGenerator() {

		Date dt = new Date();
		long milliseconds = dt.getTime();

		return milliseconds;
	}

	/*public void validatemessage() throws Exception {
		// driver.findElement(By.className("primary-heading"));
		WebElement x = driver.findElement(By.className("primary-heading"));
		assertEquals(
				"Thank you for registering at nature.com, you are almost done.",
				x.getText());
		if (true) {
			System.out.print(x.getText());
		}
		// else
		// System.out.print("User already exist");

		System.out.print("Ravi");
		driver.close();

	}*/

}
