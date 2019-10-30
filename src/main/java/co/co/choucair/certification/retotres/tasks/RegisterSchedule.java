package co.co.choucair.certification.retotres.tasks;

import co.co.choucair.certification.retotres.model.Entity.ScheduleR;
import co.co.choucair.certification.retotres.model.Schedule;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import java.util.List;

public class RegisterSchedule implements Task {
    private List<Schedule> scheduleList;
    public RegisterSchedule (List<Schedule> scheduleList) {
        this.scheduleList = scheduleList;
    }
    public static RegisterSchedule the(List<Schedule> scheduleList){
        return new RegisterSchedule(scheduleList);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        ScheduleR.getSchedule(scheduleList);

        actor.attemptsTo(Click.on());




    }
}
