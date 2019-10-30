package co.co.choucair.certification.retotres.model.Entity;

import co.co.choucair.certification.retotres.model.Schedule;

import java.util.List;

public class ScheduleR {

    public static Schedule info = new Schedule();

    public static Schedule getSchedule(List<Schedule> scheduleList){
        return info;
    }

    public static void setSchedule (List<String> Schedule){
        info.setDate(Schedule.get(0));
        info.setDocument_patiente(Schedule.get(1));
        info.setDocument_doctor(Schedule.get(2));
        info.setCommentary(Schedule.get(3));
    }

}
