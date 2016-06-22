package Sample;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS); 
		driver.get("http://only-testing-blog.blogspot.in/2014/05/form.html");
		
		WebElement mytable = driver.findElement(By.xpath(".//*[@id='post-body-8228718889842861683']/div[1]/table/tbody"));
		//To locate rows of table
		
		List<WebElement> rows_count= mytable.findElements(By.tagName("tr"));
		System.out.println(rows_count.size());
		
		for (int i=0;i<rows_count.size();i++)
		{
			List<WebElement> cols_count=rows_count.get(i).findElements(By.tagName("td"));
			
			System.out.println(cols_count.size());
			
			for (int j=0;j<cols_count.size();j++)
			{
				
				String st=cols_count.get(j).getText();
				System.out.println(st);
				
			}
			
		}
		}
	}
