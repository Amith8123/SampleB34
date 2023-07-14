package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		//driver.get("http://demo.seleniumeasy.com/basic-checkbox-demo.html");
		//System.out.println(driver.getCurrentUrl());
		//driver.findElement(By.id("//input[@id='searchBar'].sendKeys("Test");
//		WebElement optchk=driver.findElement(By.xpath("//input[@class='cb1-element']"));
//		if(!optchk.isSelected()) {
//			optchk.click();
//	}
//		driver.get("http://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
//	driver.manage().window().maximize();
//	//driver.wait(5);
//		Select sel=new Select(driver.findElement(By.id("//select[@id='select-demo']")));
//	sel.selectByVisibleText("Wednesday");
//	sel.deselectByVisibleText("Wednesday");
//	System.out.println(sel);
//	driver.close();
	
	driver.get("http://demo.seleniumeasy.com/table-sort-search-demo.html");
    String ofc= driver.findElement(By.xpath("//td[contains(text(), 'B. Wagner')]//following-sibling::td[2]")).getText();
	System.out.println(ofc);
	
	driver.get("http://demo.seleniumeasy.com/table-sort-search-demo.html");
    //String ofc= driver.findElement(By.xpath("//td[contains(text(), 'B. Wagner')]//following-sibling::td[2]")).getText();
	System.out.println(ofc);
	
	
	driver.close();
	
	}

}
