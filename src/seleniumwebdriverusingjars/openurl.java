package seleniumwebdriverusingjars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openurl {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shalu\\eclipse-workspace\\seleniumwebdriverproject\\Driver\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();		
		dr.get("https://www.google.com/");
		dr.manage().window().maximize();
		String a = dr.getCurrentUrl();
		System.out.println(a);
		Thread.sleep(1000);
		
		//dr.quit(); //Quit the browser - It close entire browser
		dr.close(); //Close the browser - It close the tab not entire browser
	}

}
