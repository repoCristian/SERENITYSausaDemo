package com.utest.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class GoTo implements Task {
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url("https://www.saucedemo.com/")
        );
    }
    public static GoTo theUrl(){
        return Tasks.instrumented(GoTo.class);
    }
}