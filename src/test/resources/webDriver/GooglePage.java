package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GooglePage {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://automationbookstore.dev/");
		//System.out.println(driver.getCurrentUrl());
		driver.findElement(By.id("//input[@id='searchBar'].sendKeys("Test");
		
		
	}

}
