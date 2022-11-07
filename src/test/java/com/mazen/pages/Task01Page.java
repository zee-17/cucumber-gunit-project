package com.mazen.pages;

import com.mazen.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task01Page {
    public Task01Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
@FindBy (xpath = "//select[@id='month']")
    public WebElement monthDropdown;
}
