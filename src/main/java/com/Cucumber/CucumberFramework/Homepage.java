package com.Cucumber.CucumberFramework;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends BasePage {
	
@FindBy(id="twotabsearchtextbox")
private WebElement srchtxtbox;

@FindBy(className="nav-input")
private WebElement srchbtn;

public Homepage(){
	PageFactory.initElements(driver, this);
}

public void enteringsearchtxt(String arg1){
	setText(srchtxtbox,arg1);
	System.out.println();
}

public WebElement searchbutton(){
	return srchbtn;
}


}
