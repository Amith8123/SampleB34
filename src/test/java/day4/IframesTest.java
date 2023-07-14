package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class IframesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		String str=driver.findElement(By.xpath("//label/span")).getText();
		System.out.println(str);
		driver.switchTo().frame("frame1");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello World");
		//driver.switchTo().frame("frame3");
		driver.switchTo().frame(0);
		driver.findElement(By.id("a")).click();
		driver.switchTo().parentFrame();
		
		driver.findElement(By.xpath("//input[@type='text']")).clear();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Welcome");
		driver.switchTo().defaultContent();
		System.out.println(driver.findElement(By.xpath("//label/span")).getText());
		driver.close();
		//selecting dropdown
		
	}

}
