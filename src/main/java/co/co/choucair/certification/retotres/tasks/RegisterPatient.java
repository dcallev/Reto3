package co.co.choucair.certification.retotres.tasks;

import co.co.choucair.certification.retotres.model.Entity.PatientR;
import co.co.choucair.certification.retotres.model.Patient;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.conditions.Check;

import static co.co.choucair.certification.retotres.userinterface.RegisterPatientPage.*;

import java.util.List;

public class RegisterPatient implements Task {
    private List<String> patientList;
    public RegisterPatient (List<String> patientList){

        this.patientList = patientList;
    }
    public static RegisterPatient the(List<String> patientList){

        return new RegisterPatient(patientList);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        PatientR.setPatient(patientList);

        actor.attemptsTo(Click.on(ADD_PATIENT),
                Enter.theValue(PatientR.getPatient().getFull_name()).into(FULL_NAME),
                Enter.theValue(PatientR.getPatient().getLast_name()).into(LAST_NAME),
                Enter.theValue(PatientR.getPatient().getPhone()).into(PHONE),
                SelectFromOptions.byVisibleText(PatientR.getPatient().getType_document()).from(TYPE_DOCUMENT),
                Enter.theValue(PatientR.getPatient().getDocument_patient()).into(DOCUMENT),
                Check.whether(PatientR.getPatient().getPrepaid().equals("YES"))
                                                    .andIfSo(Click.on(PREPAID)),
                Click.on(SAVE)


        );

    }
}
