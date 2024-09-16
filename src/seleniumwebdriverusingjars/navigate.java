package seleniumwebdriverusingjars;

import org.openqa.selenium.chrome.ChromeDriver;

public class navigate {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shalu\\eclipse-workspace\\seleniumwebdriverproject\\Driver\\chromedriver.exe");
		ChromeDriver dr=new ChromeDriver();		
		//dr.get("https://www.google.com/");
		dr.navigate().to("https://www.google.com/");
		dr.manage().window().maximize();
		
		Thread.sleep(4000);
		dr.navigate().forward();
		
		Thread.sleep(4000);		
		dr.navigate().refresh();
		
		dr.navigate().back();
		Thread.sleep(4000);
		
		dr.close();
		
	}

}
