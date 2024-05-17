package com.utest.stepdefinitions.login;

import com.utest.questions.ErrorVisibleQuestions;
import com.utest.tasks.EnterInfo;
import com.utest.tasks.GoTo;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class LoginStepDefinitions {
    @Before
    public void setUp(){
        WebDriverManager.edgedriver().setup();
        setTheStage(new OnlineCast());
    }

    @Given("that {} open website")
    public void givenMIERDA(String actorName){
        theActorCalled(actorName).wasAbleTo(GoTo.theUrl());
    }
    @When("user attemp to sing in")
    public void whenUserAttempTosingIn(DataTable data){
        theActorInTheSpotlight().attemptsTo(EnterInfo.Form(data));
    }

    @Then("user should see error mesage")
    public void thenUserShouldSeeErrorMesage(){
        theActorInTheSpotlight().should(seeThat(ErrorVisibleQuestions.succesRegister()));
    }
}
