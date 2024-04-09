package org.stepdefenition;

import org.bas.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoFbRegister extends BaseClass {

	public PojoFbRegister() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "u_0_0_gy")
	private WebElement CreateNewact;
	
	@FindBy(name = "firstname")
	private WebElement FirstName;
	
	@FindBy(id = "u_g_d_NJ")
	private WebElement SecondName;
	
	@FindBy(name = "reg_email__")
	private WebElement mobileoremail;
	
	@FindBy(name = "reg_passwd__")
	private WebElement password;

	public WebElement getCreateNewact() {
		return CreateNewact;
	}

	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getSecondName() {
		return SecondName;
	}

	public WebElement getMobileoremail() {
		return mobileoremail;
	}

	public WebElement getPassword() {
		return password;
	}
}
