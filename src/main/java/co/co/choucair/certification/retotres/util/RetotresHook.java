package co.co.choucair.certification.retotres.util;

import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class RetotresHook {

    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
    }
}
