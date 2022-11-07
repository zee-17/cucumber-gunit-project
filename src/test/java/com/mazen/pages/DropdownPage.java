package com.mazen.pages;

import com.mazen.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DropdownPage {
    public DropdownPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy (id="month")
    public WebElement monthDropdown;
}
