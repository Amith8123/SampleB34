package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDomTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("http://watir.com/examples/shadow_dom.html");
		WebElement shadowHost=driver.findElement(By.cssSelector("#shadow_host"));
		SearchContext context=shadowHost.getShadowRoot();
		WebElement shadowcontext=context.findElement(By.cssSelector("#shadow_content"));
		System.out.println(shadowcontext.getText());
		driver.close();
	}

}
