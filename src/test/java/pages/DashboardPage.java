package pages;
import cucumber.deps.com.thoughtworks.xstream.mapper.Mapper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import runners.CucumberRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DashboardPage extends CucumberRunner {
    WebDriverWait wait = new WebDriverWait(driver, 10);

    public  void logout() throws Exception {
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.xpath("/html/body/main/div/header/div[2]/div/div/div[4]/div/div[2]/button"));
        action.moveToElement(we).build().perform();
        WebElement b = driver.findElement(By.xpath("/html/body/main/div/header/div[2]/div/div/div[4]/div/div[2]/div/ul/li[3]/a"));
        wait.until(ExpectedConditions.elementToBeClickable(b));
        b.click();
        Thread.sleep(6000);

    }
    public void EnterUser(String user) throws Exception {
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));

                WebElement username = driver.findElement(By.id("email"));
                     username.sendKeys(user);
                     Thread.sleep(1000);
            }



    public  void EnterPass(String pass) throws Exception {

                WebElement password = driver.findElement(By.id("pass"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass")));

        password.sendKeys(pass);
                Thread.sleep(3000);
    }
    public  void ClickSubmitButton()  {

        /*WebElement radiobutton2 = driver.findElement(By.xpath("//*[@id=\"accept_gdpr\"]"));
        wait.until(ExpectedConditions.elementToBeClickable(radiobutton2));
        radiobutton2.click();*/
        WebElement submit_Btn = driver.findElement(By.xpath("//*[@id=\"send2\"]"));
        wait.until(ExpectedConditions.elementToBeClickable(submit_Btn));
        submit_Btn.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
   

    public void SigninBtn() throws Exception {
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.xpath("/html/body/main/div/header/div[2]/div/div/div[4]/div/div[2]/button"));
        action.moveToElement(we).build().perform();
        WebElement elem = driver.findElement(By.xpath("/html/body/main/div/header/div[2]/div/div/div[4]/div/div[2]/div/ul/li[4]/a"));
        wait.until(ExpectedConditions.elementToBeClickable(elem));
        elem.click();
        Thread.sleep(3000);
    }
    public void RegisterEmail() throws Exception {
        WebElement elem = driver.findElement(By.xpath("//a[@class='action create']//span"));
        wait.until(ExpectedConditions.elementToBeClickable(elem));
        elem.click();
        Thread.sleep(3000);
    }
    public void RegisterData(String mail,String pw) throws Exception {
        WebElement first_name = driver.findElement(By.id("firstname"));
        wait.until(ExpectedConditions.visibilityOf(first_name));
        first_name.sendKeys("Saqlain");
        WebElement last_name = driver.findElement(By.id("lastname"));
        wait.until(ExpectedConditions.visibilityOf(last_name));
        last_name.sendKeys("Haider");
        WebElement email = driver.findElement(By.id("email_address"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", email);
        email.sendKeys(mail);
        WebElement password = driver.findElement(By.id("password"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", password);
        password.sendKeys(pw);
        WebElement passwordConfirm = driver.findElement(By.id("password-confirmation"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", passwordConfirm);
        passwordConfirm.sendKeys(pw);
       /* WebElement radiobutton1 = driver.findElement(By.xpath("//*[@id=\"remember_meMonrNbF3Wz\"]"));
        wait.until(ExpectedConditions.elementToBeClickable(radiobutton1));
        radiobutton1.click();
        WebElement radiobutton2 = driver.findElement(By.xpath("//*[@id=\"accept_gdpr\"]"));
        wait.until(ExpectedConditions.elementToBeClickable(radiobutton2));
        radiobutton2.click();*/
        WebElement conformBtn = driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div/div/div[2]/button"));
        wait.until(ExpectedConditions.elementToBeClickable(conformBtn));
        conformBtn.click();
        Thread.sleep(3000);
    }
    public void LoginBtn() throws Exception {
        WebElement elem = driver.findElement(By.xpath("//li[contains(@class,'last')]//a[@class='signin-modal']"));
        wait.until(ExpectedConditions.elementToBeClickable(elem));
        elem.click();
        Thread.sleep(3000);

    }

    public void SelectRandomBagCategory() throws Exception{
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.xpath("//*[@id=\"mainMenu\"]/li[2]/a/span[1]"));
        action.moveToElement(we).build().perform();
        int int_random = (int) (Math.random() * (4 - 1 + 1) + 1);
        String ProductSelector = "//*[@id=\"mobile-menu-8-1\"]/li/ul/li["+ int_random +"]/a";
        System.out.println(ProductSelector);
        driver.findElement(By.xpath(ProductSelector)).click();
        Thread.sleep(3000);
        if(ProductSelector .equals("//*[@id=\"mobile-menu-8-1\"]/li/ul/li[1]/a") ){
            Duffel();
        }else if(ProductSelector .equals("//*[@id=\"mobile-menu-8-1\"]/li/ul/li[2]/a")) {
            Tote();
        }else if (ProductSelector .equals ("//*[@id=\"mobile-menu-8-1\"]/li/ul/li[3]/a")){
            BackPacks();
        }else if (ProductSelector .equals ("//*[@id=\"mobile-menu-8-1\"]/li/ul/li[4]/a")){
            SmallGoods();
        }
    }

    public void Duffel() throws Exception{
        int int_random1 = (int) (Math.random() * (22 - 1 + 1) + 1);
        String CategorySelector = "//*[@id=\"product-wrapper\"]/ol/li[" + int_random1 + "]/div[2]/h5/a";
        try {
            Thread.sleep(5000);
            System.out.println(CategorySelector);
            driver.findElement(By.xpath(CategorySelector)).click();
            Thread.sleep(10000);
            WebElement AddtoCart = driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]"));
            wait.until(ExpectedConditions.elementToBeClickable(AddtoCart));
            if (AddtoCart.isDisplayed()) {
                AddtoCart.click();
                Thread.sleep(5000);
                WebElement minicart = driver.findElement(By.xpath("//*[@id=\"minicart-content-wrapper\"]/div/div[2]/div[2]/div[1]/a"));
                wait.until(ExpectedConditions.elementToBeClickable(minicart));
                minicart.click();
                Thread.sleep(5000);
            } else {
                System.out.println("Add to cart is not present");

            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void Tote() throws Exception{
        int int_random1 = (int) (Math.random() * (9 - 1 + 1) + 1);
        String CategorySelector = "//*[@id=\"product-wrapper\"]/ol/li[" + int_random1 + "]/div[2]/h5/a";
        try {
            Thread.sleep(5000);
            System.out.println(CategorySelector);
            driver.findElement(By.xpath(CategorySelector)).click();
            Thread.sleep(10000);
            WebElement AddtoCart = driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]"));
            wait.until(ExpectedConditions.elementToBeClickable(AddtoCart));
            if (AddtoCart.isDisplayed()) {
                AddtoCart.click();
                Thread.sleep(5000);
                WebElement minicart = driver.findElement(By.xpath("//*[@id=\"minicart-content-wrapper\"]/div/div[2]/div[2]/div[1]/a"));
                wait.until(ExpectedConditions.elementToBeClickable(minicart));
                minicart.click();
                Thread.sleep(5000);
            } else {
                System.out.println("Add to cart is not present");

            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void BackPacks() throws Exception{
        int int_random1 = (int) (Math.random() * (5 - 1 + 1) + 1);
        String CategorySelector = "//*[@id=\"product-wrapper\"]/ol/li[" + int_random1 + "]/div[2]/h5/a";
        try {
            Thread.sleep(5000);
            System.out.println(CategorySelector);
            driver.findElement(By.xpath(CategorySelector)).click();
            Thread.sleep(10000);
            WebElement AddtoCart = driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]"));
            wait.until(ExpectedConditions.elementToBeClickable(AddtoCart));
            if (AddtoCart.isDisplayed()) {
                AddtoCart.click();
                Thread.sleep(5000);
                WebElement minicart = driver.findElement(By.xpath("//*[@id=\"minicart-content-wrapper\"]/div/div[2]/div[2]/div[1]/a"));
                wait.until(ExpectedConditions.elementToBeClickable(minicart));
                minicart.click();
                Thread.sleep(5000);
            } else {
                System.out.println("Add to cart is not present");

            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void SmallGoods() throws Exception{
        int int_random1 = (int) (Math.random() * (10 - 1 + 1) + 1);
        String CategorySelector = "//*[@id=\"product-wrapper\"]/ol/li[" + int_random1 + "]/div[2]/h5/a";
        try {
            Thread.sleep(5000);
            System.out.println(CategorySelector);
            driver.findElement(By.xpath(CategorySelector)).click();
            Thread.sleep(10000);
            WebElement AddtoCart = driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]"));
            wait.until(ExpectedConditions.elementToBeClickable(AddtoCart));
            if (AddtoCart.isDisplayed()) {
                AddtoCart.click();
                Thread.sleep(5000);
                WebElement minicart = driver.findElement(By.xpath("//*[@id=\"minicart-content-wrapper\"]/div/div[2]/div[2]/div[1]/a"));
                wait.until(ExpectedConditions.elementToBeClickable(minicart));
                minicart.click();
                Thread.sleep(5000);
            } else {
                System.out.println("Add to cart is not present");

            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

   

    public void proceedToCheckoutAndRedirectToPaypal() throws Exception{
        WebElement checkout = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div[2]/div[4]/div[2]/ul/li[1]/button"));
        wait.until(ExpectedConditions.elementToBeClickable(checkout));
        checkout.click();
        Thread.sleep(10000);
        WebElement NextBtn = driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/div/button"));
        wait.until(ExpectedConditions.elementToBeClickable(NextBtn));
        NextBtn.click();
        Thread.sleep(8000);
        WebElement Paypalradiobtn = driver.findElement(By.xpath("//*[@id=\"paypal_express\"]"));
        wait.until(ExpectedConditions.elementToBeClickable(Paypalradiobtn));
        Paypalradiobtn.click();
        Thread.sleep(8000);
        WebElement PaypalRedirect = driver.findElement(By.xpath("//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[2]/div[3]/div/button"));
        wait.until(ExpectedConditions.elementToBeClickable(PaypalRedirect));
        PaypalRedirect.click();
        Thread.sleep(10000);
    }


    
        

        
      /*  int int_random = (int) (Math.random() * (18 - 1 + 1) + 1);
        String CategorySelector = "//*[@id=\"mainMenu\"]/li["+ int_random +"]/a";
        System.out.println(CategorySelector);
        driver.findElement(By.xpath(CategorySelector)).click();
        Thread.sleep(7000);*/

}
