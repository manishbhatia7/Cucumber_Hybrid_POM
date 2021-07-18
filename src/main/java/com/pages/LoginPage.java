package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By emailid= By.id("email");
    private By password= By.id("passwd");
    private By login= By.id("SubmitLogin");
    private By forgotpasswordLink=By.linkText("Forgot your password?");
    public LoginPage(WebDriver driver)
    {

        this.driver=driver;
    }
    public String GetStringTitle()
    {

        return driver.getTitle();
    }

    public boolean isForgotPasswordLinkExist()
    {

        return driver.findElement(forgotpasswordLink).isDisplayed();
    }

    public void enterUserName(String username)
    {
        driver.findElement(emailid).sendKeys((username));
    }
    public void enterPassword(String pwd)
    {
        driver.findElement(password).sendKeys(pwd);
    }
    public void submit_login()
    {
        driver.findElement(login).click();
    }

}
