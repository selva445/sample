package Sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
			//To locate columns  of table
		
			WebDriver driver = new FirefoxDriver();
			driver.get("http://www.lufthansa.com/ua/en/Homepage#");
			driver.manage().window().maximize();
			//@SuppressWarnings("unused")
			String st=driver.getTitle();
			String gt="Ready for";
			if (st.contains(gt)){
				System.out.println("Test Passed!");
			}
			else
			{
				System.out.println("Test Failed!");
			}
			
			//test logo
			WebElement header= driver.findElement(By.className("sr-only"));
			String st1= header.getText();
			System.out.println(st1);
			
			if (st.contains("Luft")){
				System.out.println("Test Passed!");
			}
			else
			{
				System.out.println("Test Failed!");
			}
			
			
			//link test
			
//			WebElement infs= driver.findElement(By.partialLinkText("Information & Service"));
//			infs.click();
//			WebElement infstempl= driver.findElement(By.partialLinkText("Travel"));
//			String st2= infstempl.getText();
//			System.out.println(st2);			
//			if (st2.contains("Travel")){
//				System.out.println("Test Passed!");
//			}
//			else
//			{
//				System.out.println("Test Failed!");
//			}
			
			//Enter ID and Check
			
			//lastname	
			driver.manage().timeouts().implicitlyWait(2,TimeUnit.MILLISECONDS);			
			WebDriverWait myvar=new WebDriverWait(driver,10);
			//myvar.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( ".//*[contains(@id,'lastname')]")));
			WebElement lname= driver.findElement(By.xpath( ".//*[contains(@id,'lastname')]"));
			lname.sendKeys("Fname");
	
			//radiobutton
			WebElement searchoptions= driver.findElement(By.partialLinkText("Search with more options"));
			searchoptions.click();
			WebElement trip= driver.findElement(By.xpath( ".//*[contains(@id,'triptypeOneway')]"));
			myvar.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( ".//*[contains(@id,'triptypeOneway')]")));
			trip.click();			
			Select sel= new Select(driver.findElement(By.id("bookingClass")));
			sel.selectByVisibleText("Business");
			
			
			Actions dri= new Actions(driver);
			WebElement toElement=driver.findElement(By.partialLinkText("Corporate Customers"));
			Action ser=(Action) dri.moveToElement(toElement).build();		
			ser.perform();
			
			
			
	}

}
