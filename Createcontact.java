package assigment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Createcontact {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("mukesh kannan");
		driver.findElement(By.id("lastNameField")).sendKeys("paramasiva periyar");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("m");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("k");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("computer science");
		driver.findElement(By.id("createContactForm_description")).sendKeys("hello everyone");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("mukeskannan2016@gmail.com");
		WebElement createContactForm_generalStateProvinceGeoId= driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select dd1=new Select(createContactForm_generalStateProvinceGeoId);
		dd1.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.className("subMenuButton")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("updated");
		driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/div[2]/div[1]/div/form/div/div[2]/table/tbody/tr[8]/td[2]/input")).click();
		
		
		
		
	}
	

}
