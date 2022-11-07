package com.mazen.pages;

import com.mazen.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WebTableOrderPage extends BasePage {
   public WebTableOrderPage(){
       PageFactory.initElements(Driver.getDriver(),this);
   }

    @FindBy (xpath = "//button[.='Order']")
    public WebElement orderButton;

   @FindBy (name="product")
    public WebElement productTypeDropdown;

    @FindBy (xpath = "//input[@placeholder='Full name of the customer']")
    public WebElement customerName;

 @FindBy(name="quantity")
 public WebElement inputQuantity;

    @FindBy(xpath = "//button[.='Process Order']")
    public WebElement processOrderButton;



    @FindBy (xpath = "//select[@name='product']")
    public WebElement typeName;

    @FindBy
    public WebElement productTypeDropdow;

    @FindBy (xpath = "//input[@placeholder='Street address of the customer']")
    public WebElement street;

    @FindBy (xpath = "//input[@placeholder='City where the customer lives']")
    public WebElement city;

    @FindBy (xpath = "//input[@placeholder='State where the customer lives']")
    public WebElement state;

    @FindBy (xpath = "//input[@name='zip']")
    public WebElement zipCode;

    @FindBy (name = "card")
    public List<WebElement> cardType;



    @FindBy  (name="cardNo")
    public WebElement cardNumber;

    @FindBy (name="cardExp")
    public WebElement dateExpire;
}
