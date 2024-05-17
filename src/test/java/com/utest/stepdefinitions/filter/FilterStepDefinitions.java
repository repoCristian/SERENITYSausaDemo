package com.utest.stepdefinitions.filter;

import net.serenitybdd.screenplay.Actor;
import com.utest.questions.FilterQuestions;
import com.utest.tasks.EnterInfo;
import com.utest.tasks.GoTo;
import com.utest.tasks.cart.FilterPriceProducts;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.is;

public class FilterStepDefinitions {
    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("{} opened website")
    public void givenOpenedWebsite(String actorName){
        theActorCalled(actorName).wasAbleTo(GoTo.theUrl());
    }

    @When("user sing in")
    public void whemUserSingIn(DataTable data){
        theActorInTheSpotlight().attemptsTo(EnterInfo.Form(data));
    }

    @And("click on filter")
    public void andClickOnFilter(){
        theActorInTheSpotlight().attemptsTo(FilterPriceProducts.Filter());
    }

    @Then("user should see the mayor price")
    public void thenUserShouldSeeTheMayorPrice(){
        Actor actor = theActorInTheSpotlight();
        int max = FilterQuestions.comparePrices(actor);
    }
}
