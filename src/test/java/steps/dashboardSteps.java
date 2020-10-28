package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.DashboardPage;
import runners.CucumberRunner;

public class dashboardSteps {
    DashboardPage db = new DashboardPage();
    CucumberRunner c = new CucumberRunner();

  



    

    

    @Then("^I Click Login my account$")
    public void iClickLoginMyAccount() throws Exception {
        db.SigninBtn();
    }

    @Then("^I Enter  \"([^\"]*)\" and \"([^\"]*)\" credentials$")
    public void iEnterAndCredentials(String arg0, String arg1)  throws Exception {
        db.EnterUser(arg0);
        db.EnterPass(arg1);
        db.ClickSubmitButton();
    }

    @Then("^I Select a random category of Bags$")
    public void iSelectARandomCategoryOfBags() throws Exception{
        db.SelectRandomBagCategory();
    }
    


   @When("^I enter \"([^\"]*)\" and \"([^\"]*)\"$")
   public void iEnterAnd(String user, String pass) throws Exception {
       // Write code here that turns the phrase above into concrete actions
       db.EnterUser(user);
       db.EnterPass(pass);
   }

   @Then("^I logout$")
   public void iLogout() throws Exception {
   db.logout();
   }


   @Given("^I am on Mont(\\d+) Home page$")
   public void iAmOnMontHomePage(int arg0)  throws Exception{
       c.setEnv();
   }
   
  /* @Then("^Proceed to checkout and redirect to paypal$")
   public void proceed_to_checkout_and_redirect_to_paypal() throws Throwable {
       // Write code here that turns the phrase above into concrete actions
       throw new PendingException();
   }*/
}




   

