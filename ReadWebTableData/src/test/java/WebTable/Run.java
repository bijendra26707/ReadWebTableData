package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Run {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\Bijendra_Kumar\\Downloads\\MicrosoftWebDriver.exe");
		EdgeOptions options = new EdgeOptions();
		options.setPageLoadStrategy("eager");
		WebDriver driver = new EdgeDriver(options);
		driver.get("https://www.google.co.in");
		Table table=new Table(driver.findElement(By.xpath("./table")));
	
	}
}
