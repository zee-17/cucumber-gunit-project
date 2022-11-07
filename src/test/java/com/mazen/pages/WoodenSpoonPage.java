package com.mazen.pages;

import com.mazen.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WoodenSpoonPage {

    public WoodenSpoonPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
        @FindBy(xpath = "//input[@name='search_query']")
        public WebElement SearchBox;


        }






