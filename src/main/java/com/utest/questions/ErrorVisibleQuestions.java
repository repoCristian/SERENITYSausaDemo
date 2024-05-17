package com.utest.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static com.utest.ui.LoginUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ErrorVisibleQuestions implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor){
        WaitUntil.the(INF_ERROR,isVisible()).forNoMoreThan(20).seconds();
        return true;
    }


    public static ErrorVisibleQuestions succesRegister(){
        return new ErrorVisibleQuestions();
    }

}
