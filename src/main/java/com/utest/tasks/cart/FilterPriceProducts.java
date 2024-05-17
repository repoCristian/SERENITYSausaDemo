package com.utest.tasks.cart;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.utest.ui.FilterPriceUI.*;

public class FilterPriceProducts implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(BTN_FILTER)
        );
    }
    public static FilterPriceProducts Filter(){
        return Tasks.instrumented(FilterPriceProducts.class);
    }
}
