package week5.day1;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead3 extends ProjectSpecificMethods {
	@Test(dataProvider = "testData")
	public void runCreateLead(String username, String password, String companyName, String firstName, String lastName) {
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		driver.findElement(By.name("submitButton")).click();
	}

	@DataProvider
	public String[][] testData() {
		String[][] array = new String[2][5];
		array[0][0] = "DemoSalesManager";
		array[0][1] = "crmsfa";
		array[0][2] = "TestLeaf";
		array[0][3] = "Sreelekshmi";
		array[0][4] = "S";

		array[1][0] = "DemoCSR";
		array[1][1] = "crmsfa";
		array[1][2] = "TestLeaf";
		array[1][3] = "Aarav";
		array[1][4] = "S";

		return array;

	}

}
