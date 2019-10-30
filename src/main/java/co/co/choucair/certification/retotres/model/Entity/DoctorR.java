package co.co.choucair.certification.retotres.model.Entity;

import co.co.choucair.certification.retotres.model.Doctor;

import java.util.List;

    public class DoctorR {

        public static Doctor info = new Doctor();

        public static Doctor getDoctor () {
        return info;
    }

    public static void setDoctor (List<String> Doctor){

        info.setFull_name(Doctor.get(0));
           info.setLast_name(Doctor.get(1));
           info.setPhone(Doctor.get(2));
           info.setType_document(Doctor.get(3));
           info.setDocument_doctor(Doctor.get(4));


        }
    }



