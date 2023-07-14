package day4;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupWindow {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://stqatools.com/demo/Windows.php");
		String parentWin=driver.getWindowHandle();
		System.out.println("ParentWindow"+parentWin);

		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Set<String> tabs=driver.getWindowHandles();
		System.out.println("Total Windows"+tabs);
		for(String child: tabs) {
			System.out.println("child");
			if(!child.equalsIgnoreCase(parentWin)) {
				driver.switchTo().window(child);
				Thread.sleep(5);
				driver.findElement(By.xpath("(//span[@class='menu-text'])[2]"));
				driver.close();
				driver.switchTo().window(parentWin);
				//driver.findElement(By.xpath("(//button[@class='btn btn-info'])[2])"));
				//driver.quit();
				driver.switchTo().newWindow(WindowType.WINDOW);
				driver.navigate().to("https://www.selenium.dev/");
				TakesScreenshot screen=(TakesScreenshot)driver;
				File src=screen.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(src, new File("C:\\Users\\Administrator\\Documents\\Selenium\\Screenshot.png"));
				WebElement img=driver.findElement(By.xpath("//*[@class='cls-selenium_ide']"));
				
				File src1=img.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(src1, new File("C:\\Users\\Administrator\\Documents\\Selenium\\Screenshot.png"));
				
				
				
				
			}
		}
		
		
	}

}
