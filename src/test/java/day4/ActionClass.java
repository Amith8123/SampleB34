package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		Actions act=new Actions(driver);
		driver.get("https://demo.opencart.com/");
		WebElement srch=driver.findElement(By.name("search"));
		srch.sendKeys("phone");
		WebElement menu=driver.findElement(By.cssSelector("//ul[@class='list-unstyled']//a[contains(text(), 'Monitors (2)')]"));
		act.moveToElement(menu).perform();
	}

}
