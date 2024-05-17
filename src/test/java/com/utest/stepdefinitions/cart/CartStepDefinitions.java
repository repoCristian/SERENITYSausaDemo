package com.utest.stepdefinitions.cart;


import com.utest.questions.CartQuestions;
import com.utest.tasks.EnterInfo;
import com.utest.tasks.GoTo;
import com.utest.tasks.cart.CartProductsSelect;
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


public class CartStepDefinitions {
    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("the {} has opened URL")
    public void  givenThatUserHasOpenedWebsite(String actorName){
        theActorCalled(actorName).wasAbleTo(GoTo.theUrl());
    }

    @When("user get in select six items")
    public void whenUserAttempTosingIn(DataTable data){
        theActorInTheSpotlight().attemptsTo(EnterInfo.Form(data));
    }

    @And("user click on two items")
    public void andUserClickOnTwoItems(DataTable data){
        theActorInTheSpotlight().attemptsTo(CartProductsSelect.Items(data));
    }

     @Then("user should in the car section 2 products")
    public void thenUserShouldInTheCarSection2Products(){
        theActorInTheSpotlight().should(seeThat(CartQuestions.numberItems(),is(2)));
    }

}