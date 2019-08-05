package myPack;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Avinash {
	@Test
	public static void verifyLogin() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://apps.qaplanet.in/qahrm");
		
		//login
		driver.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
		driver.findElement(By.name("txtPassword")).sendKeys("lab1");
		driver.findElement(By.name("Submit")).click();
		
		//verify page Title...
		if(driver.getTitle().equals("OrangeHRM")) {
			System.out.println("TC_VerifyLogin passed!");
		}else {
			System.out.println("TC_VerifyLogin failed!");
		}
		
		//logout...
		driver.findElement(By.linkText("Logout")).click();
				
		//close browser...
		driver.close();
	}
	@Test
	public static void addEmp() {
		System.out.println("Add emp passed!");
	}
	@Test
	public static void editEmp() {
		System.out.println("Edit emp passed!");
	}
	@Test
	public static void deleteEmp() {
		System.out.println("Delete emp passed!");
	}
}
