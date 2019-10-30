package co.co.choucair.certification.retotres.model;

public class Patient {
    private String full_name;
    private String last_name;
    private String phone;
    private String type_document;
    private String document_patient;
    private String prepaid;


    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getType_document() {
        return type_document;
    }

    public void setType_document(String type_document) {
        this.type_document = type_document;
    }



    public String getDocument_patient() {
        return document_patient;
    }

    public void setDocument_patient(String document_patient) {
        this.document_patient = document_patient;
    }

    public String getPrepaid() {
        return prepaid;
    }

    public void setPrepaid(String prepaid) {
        prepaid = prepaid;
    }


}


