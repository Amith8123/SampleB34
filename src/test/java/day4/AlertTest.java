package day4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

		driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.dismiss();
//		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
//		System.out.println(alert.getText());
//		System.out.println(alert.getText());
//		alert.accept();
		Thread.sleep(2);
		driver.findElement(By.xpath("(//button[@class='btn btn-default btn-lg'])[2]")).click();
		Alert alert1=driver.switchTo().alert();
		System.out.println(alert1.getText());
		alert.accept();
		
		
		
		
		
	}

}
