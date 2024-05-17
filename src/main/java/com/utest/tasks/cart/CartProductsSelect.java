package com.utest.tasks.cart;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;


import java.util.List;
import java.util.Map;

import static com.utest.ui.CartUI.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CartProductsSelect implements Task {

    private DataTable data;
    public CartProductsSelect(DataTable data){
        this.data=data;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        List<Map<String,String>> values = data.asMaps(String.class,String.class);

        actor.attemptsTo(
                Click.on(BTN_UNO),
                Click.on(BTN_DOS),
                WaitUntil.the(BTN_cart,isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BTN_cart),
                Click.on(BTN_checkout),
                Enter.theValue(values.get(0).get("firstName")).into("//input[@data-test='firstName']"),
                Enter.theValue(values.get(0).get("Lastname")).into("//input[@data-test='lastName']"),
                Enter.theValue(values.get(0).get("Zipcode")).into("//input[@name='postalCode']"),
                Click.on(BTN_continue)

        );

    }
    public static CartProductsSelect Items(DataTable data){
        return Tasks.instrumented(CartProductsSelect.class,data);
    }
}
