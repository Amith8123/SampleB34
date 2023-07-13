import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Day4 {
	public static void main(String[] args){
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.seleniumeasy.com/basic-checkbox-demo.html");
		//System.out.println(driver.getCurrentUrl());
		//driver.findElement(By.id("//input[@id='searchBar'].sendKeys("Test");
		WebElement optchk=driver.findElement(By.xpath("//input[@class='cb1-element']"))
		if(!optchk.isSelected()) {
			optchk.click();
	}

}

}
