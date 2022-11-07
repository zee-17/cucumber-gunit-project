package com.mazen.pages;

import com.mazen.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebtableAppPage {
    public WebtableAppPage(){
        PageFactory.initElements(Driver.getDriver(),this);

//        C #: Login scenario
//        1- Open a chrome browser 2- Go to:
//        https://web-table-2.cydeo.com/login
//        3- Enter  username:  Test
//        4- Enter password: Tester
//        5- Verify URL:

    }
    @FindBy(xpath = "//input[@name='username']")
    public WebElement inputUsername;

    @FindBy(name="password")
    public WebElement inputPassword;

    @FindBy(xpath="//button[@type='submit']")
    public WebElement loginButton;

    @FindBy (tagName = "path")
    public WebElement path;

    @FindBy (xpath = "//button[.='Order']")
    public WebElement orderButton;
//
//    @FindBy (xpath = )
//    public WebElement productType;
//
//    @FindBy
//    public WebElement quantity;

    @FindBy (xpath = "//input[@placeholder='Full name of the customer']")
    public WebElement customerName;

    @FindBy (xpath = "//input[@placeholder='Street address of the customer']")
    public WebElement street;

    @FindBy (xpath = "//input[@placeholder='City where the customer lives']")
    public WebElement city;

    @FindBy (xpath = "//input[@placeholder='State where the customer lives']")
    public WebElement state;

    @FindBy (xpath = "//input[@name='zip']")
    public WebElement zipCode;

    @FindBy (xpath = "//*[@value='American Express']")
    public WebElement cardType;
//
//    @FindBy
//    public WebElement cardNumber;
//
//    @FindBy
//    public WebElement dateExpire;

    public void login(String username,String password){
        inputUsername.sendKeys(username);
        inputPassword.sendKeys(password);
        loginButton.click();
    }



}
