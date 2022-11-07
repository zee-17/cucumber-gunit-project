package com.mazen.pages;

import com.mazen.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class EstyTitlePage {
    public EstyTitlePage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
}
