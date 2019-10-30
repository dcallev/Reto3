package co.co.choucair.certification.retotres.tasks;

import co.co.choucair.certification.retotres.model.Entity.DoctorR;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

import static co.co.choucair.certification.retotres.userinterface.RegisterDoctorPage.*;

public class RegisterDoctor implements Task {
    private List<String> doctorList;
    public RegisterDoctor (List<String> doctorList){
        this.doctorList = doctorList;
    }
    public static RegisterDoctor the(List<String> doctorList){
        return new RegisterDoctor(doctorList);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

        DoctorR.setDoctor(doctorList);

        actor.attemptsTo(Click.on(ADD_DOCTOR),
                Enter.theValue(DoctorR.getDoctor().getFull_name()).into(FULL_NAME),
                Enter.theValue(DoctorR.getDoctor().getLast_name()).into(LAST_NAME),
                Enter.theValue(DoctorR.getDoctor().getPhone()).into(PHONE),
                SelectFromOptions.byVisibleText(DoctorR.getDoctor().getType_document()).from(DOCUMENT),
                Enter.theValue(DoctorR.getDoctor().getDocument_doctor()).into(SELECT_DOCUMENT),
                Click.on(SAVE)
        );

    }
}
