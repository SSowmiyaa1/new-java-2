package org.pojoclass;


import org.baseclass.Baseframe;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPojo extends Baseframe {
	public LoginPojo() {
	PageFactory.initElements(driver,this);
	}
    @FindBy(id="username")
    private WebElement txtuser;
    
    @FindBy(name="password")
    private WebElement txtpass;
    
    @FindBy(name="login")
    private WebElement btnlogin;

	public WebElement getBtnlogin() {
		return btnlogin;
	}

	public WebElement getTxtuser() {
		return txtuser;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}
	
}
