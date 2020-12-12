package test;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectDestination {

	

		
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IQBAL HOSSAIN\\eclipse-workspace\\TestProject\\src\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//span[@id='ctl00_mainContent_ddl_originStation1_CTXTaction']")).click();
		List <WebElement> city1=driver.findElements(By.className("dropdownDiv"));
		for (WebElement webcity1 : city1) {
			String cityname=webcity1.getText();
			System.out.println(cityname);
			System.out.println(cityname);
			System.out.println(cityname);
			
			 
		//driver.findElement(By.xpath("//a[contains(text(),'Jammu (IXJ)')]")).click();
		
		

	}
		
	}}
