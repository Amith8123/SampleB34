package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTip {
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Actions action=new Actions(driver);
	driver.get("https://jqueryui.com/tooltip/");
	driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
	WebElement age=driver.findElement(By.xpath("//input[@id='age']"));
	action.moveToElement(age).perform();
	String strText=driver.findElement(By.cssSelector(".ui-tooltip-content")).getText();
	System.out.println(strText);
	
}
}
