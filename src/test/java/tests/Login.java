package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login extends TestBase {
    WebDriver wd;

    @BeforeMethod
    public void preCondition(){

            if (app.getUser().isLogged()) {
                app.getUser().logOut();
            }
        }


    @Test
    public void login() {
        // WebElement el1= wd.findElement(By.cssSelector("[href='/login']"));
        // el1.click();
        //wd.findElement(By.cssSelector("[href='/login']")).click();

        app.getUser().initLogin();
        app.getUser().pause(2000);
        app.getUser().fillINLoginForm("juliakliot.jk@gmail.com", "misha240613");
        app.getUser().submitLogin();
        app.getUser().pause(2000);

        Assert.assertTrue(app.getUser().isLogged());


    }



}
