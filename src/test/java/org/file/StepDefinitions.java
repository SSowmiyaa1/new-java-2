package org.file;

import java.util.List;

import org.baseclass.Baseframe;
import org.openqa.selenium.By;
import org.pojoclass.LoginPojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class StepDefinitions extends Baseframe {
	
	/*@Given("Launch the browser and pass url")
	public void launchTheBrowserAndPassUrl() {
	   launchBrowser();	
	   passUrl("https://www.facebook.com/");	
	   maxBrowser();
	}

	@When("Enter the values in the username and password")
	public void enterTheValuesInTheUsernameAndPassword() {
	   driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("java123@gmail.com");
	   driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1232454");
		//LoginPojo l=new LoginPojo();
		//passInput(l.getTxtuser(), "java@123");
		//passInput(l.getTxtpass(), "1525626");
	}

	@When("Click the login button")
	public void clickTheLoginButton() {
		LoginPojo l1=new LoginPojo();
		btn(l1.getBtnlogin());	
	}

	@Then("user navigate the profile page")
	public void userNavigateTheProfilePage() {
	   System.out.println("verified");
	}*/
	

/*@Given("launch browser and pass url")
public void launchBrowserAndPassUrl() {
	   launchBrowser();	
	   passUrl("https://www.facebook.com/");	
	   maxBrowser();
  
}

@When("To enter the {string} and {string} and click the logic button")
public void toEnterTheAndAndClickTheLogicButton(String string, String string2) {
	   driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys(string);
	   driver.findElement(By.xpath("//input[@type='password']")).sendKeys(string2);
	   driver.findElement(By.xpath("//button[text()='Log in']"));
	
}

@Then("To navigate the profile page")
public void toNavigateTheProfilePage() {
	System.out.println("verified");
	  
}*/
	@Given("launch browser and pass url")
	public void launchBrowserAndPassUrl() {
		 launchBrowser();	
		   passUrl("https://www.facebook.com/");	
		   maxBrowser();
	    
	}
	
	/*@When("to pass values in username and password")
	public void toPassValuesInUsernameAndPassword(io.cucumber.datatable.DataTable d) {
		
		List<String> a1 = d.asList();
		String s1 = a1.get(2);
		String s2 = a1.get(3);
		  driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys(s1);
		   driver.findElement(By.xpath("//input[@type='password']")).sendKeys(s2);
		
	}

	@When("click the button")
	public void clickTheButton() {
		driver.findElement(By.xpath("//button[text()='Log in']"));
	}

	@Then("to navigate the home page")
	public void toNavigateTheHomePage() {
		System.out.println("yfcggyufghv");
	  
	}
*/
	@When("to enter values in page")
	public void toEnterValuesInPage(io.cucumber.datatable.DataTable d1) {
		List<List<String>> l = d1.asLists();
		List<String> ll = l.get(2);
		String string = ll.get(0);
		String string2 = ll.get(1);
		driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys(string);
		   driver.findElement(By.xpath("//input[@type='password']")).sendKeys(string2);
		
	}

	@When("click the login")
	public void clickTheLogin() {
		driver.findElement(By.xpath("//button[text()='Log in']"));
	}

	@Then("go to next page")
	public void goToNextPage() {
		System.out.println("fcdrtgvftyhbgh");
	    
	}

	
	
	
	
	
	

}
