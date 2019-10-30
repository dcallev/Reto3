package co.co.choucair.certification.retotres.model.Entity;

import co.co.choucair.certification.retotres.model.Patient;

import java.util.List;

public class PatientR {

    public static Patient info = new Patient();

    public static Patient getPatient (){

        return info;
    }

    public static void setPatient (List <String> Patient) {

        info.setFull_name(Patient.get(0));
        info.setLast_name(Patient.get(1));info.setPhone(Patient.get(2));
        info.setType_document(Patient.get(3));
        info.setDocument_patient(Patient.get(4));
        info.setPrepaid(Patient.get(5));

    }

}
