package com.utest.tasks;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;
import java.util.Map;

import static com.utest.ui.LoginUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class EnterInfo implements Task {

    private DataTable data;

    public EnterInfo(DataTable data){
        this.data=data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<Map<String,String>> values = data.asMaps(String.class,String.class);

        actor.attemptsTo(
                Enter.theValue(values.get(0).get("Username")).into(USERNAME),
                Enter.theValue(values.get(0).get("Pass")).into(PASS),
                Click.on(BTN_SUBMIT)

        );
    }

    public static  EnterInfo Form(DataTable data){
        return Tasks.instrumented(EnterInfo.class,data);
    }
}
