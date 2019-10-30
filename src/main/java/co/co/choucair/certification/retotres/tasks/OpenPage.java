package co.co.choucair.certification.retotres.tasks;

import co.co.choucair.certification.retotres.userinterface.OpenUp;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenPage implements Task {
    private OpenUp openUp;
    public static Performable thePageAdministrationSystem(){

        return Tasks.instrumented(OpenPage.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(openUp));

    }
}
