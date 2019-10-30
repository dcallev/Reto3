package co.co.choucair.certification.retotres.stepdefinitions;

import co.co.choucair.certification.retotres.model.Schedule;
import co.co.choucair.certification.retotres.tasks.OpenPage;
import co.co.choucair.certification.retotres.tasks.RegisterDoctor;
import co.co.choucair.certification.retotres.tasks.RegisterPatient;
import co.co.choucair.certification.retotres.tasks.RegisterSchedule;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RetotresStepDefinitions {

    @Given("^That (.*) needs to register a new doctor, patient and an appointment$")
    public void thatCarlosNeedsToRegisterANewDoctorPatientAndAnAppointment(String carlos) {
        theActorCalled(carlos).wasAbleTo(OpenPage.thePageAdministrationSystem());

    }

    @When("^He makes the registration of the doctor in the Hospital Administration application$")
    public void heMakesTheRegistrationOfTheDoctorInTheHospitalAdministrationApplication(List<String>doctorList)  {
            theActorInTheSpotlight().attemptsTo(RegisterDoctor.the(doctorList));
    }

    @Then("^he verifies that the message Data saved correctly is displayed$")
    public void heVerifiesThatTheMessageDataSavedCorrectlyIsDisplayed(){
    }

    @When("^He makes the registration of the patient in the Hospital Administration application$")
    public void heMakesTheRegistrationOfThePatientInTheHospitalAdministrationApplication(List<String>patientList) {
        theActorInTheSpotlight().attemptsTo(RegisterPatient.the(patientList));
    }

    @When("^that Carlos needs to attend the doctor$")
    public void thatCarlosNeedsToAttendTheDoctor(List<Schedule>scheduleList) {
        theActorInTheSpotlight().attemptsTo(RegisterSchedule.the(scheduleList));

    }
}
