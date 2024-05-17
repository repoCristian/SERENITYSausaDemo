package com.utest.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.utest.ui.CartUI.BTN_end;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class CartQuestions {
    public static Question<Integer> numberItems(){

       WaitUntil.the("//a[@class='shopping_cart_link']//span[@class='shopping_cart_badge']",
                isEnabled()).forNoMoreThan(50).seconds();
        return actor-> {


            String number = Target.the("itemsNumber").
                    locatedBy("//a[@class='shopping_cart_link']//span[@class='shopping_cart_badge']")
                    .resolveFor(actor).getText();
            actor.attemptsTo(Click.on(BTN_end));
                    return Integer.parseInt(number);
        };

    }
}
