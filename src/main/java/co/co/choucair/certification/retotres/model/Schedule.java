package co.co.choucair.certification.retotres.model;

public class Schedule {
    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getDocument_patiente() {
        return document_patiente;
    }

    public void setDocument_patiente(String document_patiente) {
        this.document_patiente = document_patiente;
    }

    public String getDocument_doctor() {
        return document_doctor;
    }

    public void setDocument_doctor(String document_doctor) {
        this.document_doctor = document_doctor;
    }

    public String getCommentary() {
        return commentary;
    }

    public void setCommentary(String commentary) {
        this.commentary = commentary;
    }

    private  String Date;
    private String document_patiente;
    private String document_doctor;
    private String commentary;
}